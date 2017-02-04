package local.zone.weblibrary.servlet;

import local.zone.weblibrary.db.dao.impl.LibraryDaoImpl;
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
    private LibraryDaoImpl libraryDao;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        if (username == null || "".equals(username)) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        } else {




            response.setContentType("application/xml");
            try (PrintWriter writer = response.getWriter()) {
//                writer.write();
            }
        }
    }

    @Override
    public void init() throws ServletException {
        context = new GenericXmlApplicationContext();
        context.load("app-config.xml");
        context.refresh();
    }
}
