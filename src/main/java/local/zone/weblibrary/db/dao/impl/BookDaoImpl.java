package local.zone.weblibrary.db.dao.impl;

import local.zone.weblibrary.db.dao.BookDao;
import local.zone.weblibrary.db.entity.Book;

import java.util.List;

/**
 * Created by artem on 5.2.17.
 */
public class BookDaoImpl implements BookDao {
    @Override
    public Long create(Book entity) {
        return null;
    }

    @Override
    public Book read(Long id) {
        return null;
    }

    @Override
    public List<Book> readAll() {
        return null;
    }

    @Override
    public void update(Book entity) {

    }

    @Override
    public void delete(Book entity) {

    }

    @Override
    public Book findBookByName(String name) {
        return null;
    }

    @Override
    public Book findBookByAuthor(String firstName, String lastName) {
        return null;
    }
}
