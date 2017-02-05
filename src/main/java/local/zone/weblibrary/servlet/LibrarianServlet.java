package local.zone.weblibrary.servlet;

/**
 * Created by artem on 31.1.17.
 */

import local.zone.weblibrary.db.dao.BookDao;
import local.zone.weblibrary.db.dao.HistoryDao;
import local.zone.weblibrary.db.dao.LibraryDao;
import local.zone.weblibrary.db.entity.*;
import local.zone.weblibrary.util.parser.XmlParser;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class LibrarianServlet extends HttpServlet {
    private GenericXmlApplicationContext context;
    private LibraryDao libraryDao;
    private BookDao bookDao;
    private HistoryDao historyDao;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null || "".equals(action)) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            String xmlResponse = null;
            switch (action) {
                case "list" : {
                    xmlResponse = getList();
                    if (xmlResponse == null) {
                        response.sendError(HttpServletResponse.SC_NOT_FOUND);
                    }
                    break;
                }
                case "history" : {
                    xmlResponse = getHistory(request, response);
                    if (xmlResponse == null) {
                        response.sendError(HttpServletResponse.SC_NOT_FOUND);
                    }
                    break;
                }
                case "give" : {
                    giveBook(request, response);
                    break;
                }
                case "take" : {
                    takeBook(request, response);
                    break;
                }
            }
            if (xmlResponse != null) {
                response.setContentLength(xmlResponse.length());
                response.setContentType("application/xml");
                try (PrintWriter writer = response.getWriter()) {
                    writer.write(xmlResponse);
                }
            }
        }
    }

    @Override
    public void init() throws ServletException {
        context = new GenericXmlApplicationContext();
        context.load("app-config.xml");
        context.refresh();
    }

    private void takeBook(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Long readerId = getReaderId(request);
        String bookName = request.getParameter("bookName");
        String libraryName = request.getParameter("libraryName");
        if (readerId == null || bookName == null || "".equals(bookName) || libraryName == null || "".equals(libraryName)) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            libraryDao = context.getBean("libraryDao", LibraryDao.class);
            bookDao = context.getBean("bookDao", BookDao.class);
            historyDao = context.getBean("historyDao", HistoryDao.class);
            Book bookByName = bookDao.findBookByName(bookName);
            Librarian librarian = new Librarian();
            librarian.getLibrary().getBooks().remove(bookByName);
            Reader reader = new Reader();
            reader.setId(readerId);
            History history = new History();
            history.setReader(reader);
            history.removeBook(bookByName);
            history.setBookComeBack(true);
            bookDao.update(bookByName);
            historyDao.update(history);
            request.getRequestDispatcher("index.html").forward(request, response);
        }
    }

    private void giveBook(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Long readerId = getReaderId(request);
        String bookName = request.getParameter("bookName");
        String libraryName = request.getParameter("libraryName");
        if (readerId == null || bookName == null || "".equals(bookName) || libraryName == null || "".equals(libraryName)) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            libraryDao = context.getBean("libraryDao", LibraryDao.class);
            bookDao = context.getBean("bookDao", BookDao.class);
            historyDao = context.getBean("historyDao", HistoryDao.class);
            Book bookByName = bookDao.findBookByName(bookName);
            Library library = new Library(libraryName);
            library.removeBook(bookByName);
            Reader reader = new Reader();
            reader.setId(readerId);
            History history = new History();
            history.setReader(reader);
            history.addBook(bookByName);
            history.setBookComeBack(false);
            bookDao.update(bookByName);
            historyDao.update(history);
            libraryDao.update(library);
            request.getRequestDispatcher("index.html").forward(request, response);
        }
    }

    private String getList() {
        bookDao = context.getBean("bookDao", BookDao.class);
        List<Book> books = bookDao.readAll();
        return new XmlParser().unparse(books);
    }

    private String getHistory(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Long readerId = getReaderId(request);
        if (readerId == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return null;
        } else {
            historyDao = context.getBean("historyDao", HistoryDao.class);
            History historyByReaderId = historyDao.findByReaderId(readerId);
            return new XmlParser().unparse(historyByReaderId);
        }
    }

    private Long getReaderId(HttpServletRequest request) {
        String readerParameterId = request.getParameter("readerId");
        Long readerId = null;
        if (readerParameterId != null) {
            readerId = Long.valueOf(readerParameterId);
        }
        return readerId;
    }
}
