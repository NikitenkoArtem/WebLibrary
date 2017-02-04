package local.zone.weblibrary.servlet;

/**
 * Created by artem on 31.1.17.
 */

import local.zone.weblibrary.db.dao.impl.LibraryDaoImpl;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LibrarianServlet extends HttpServlet {
    private GenericXmlApplicationContext context;
//    private LibraryDaoImpl libraryDao;

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
