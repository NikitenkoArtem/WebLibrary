package local.zone.weblibrary.servlet;

import local.zone.weblibrary.db.dao.BookDao;
import local.zone.weblibrary.db.dao.LibraryDao;
import local.zone.weblibrary.db.entity.Author;
import local.zone.weblibrary.db.entity.Book;
import local.zone.weblibrary.db.entity.Person;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by artem on 31.1.17.
 */
@WebServlet(urlPatterns = "/servlet")
public class ReaderServlet extends HttpServlet {
    private GenericXmlApplicationContext context;
    private LibraryDao libraryDao;
    private BookDao bookDao;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        context = new GenericXmlApplicationContext();
        context.load("app-config.xml");
        context.refresh();
    }
}
