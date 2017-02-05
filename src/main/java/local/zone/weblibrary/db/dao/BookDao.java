package local.zone.weblibrary.db.dao;

import local.zone.weblibrary.db.entity.Book;

import java.io.Serializable;

/**
 * Created by artem on 5.2.17.
 */
public interface BookDao extends GenericDao<Book, Long> {
    Book findBookByName(String name);
    Book findBookByAuthor(String firstName, String lastName);
}
