package local.zone.weblibrary.xml.entity;

import local.zone.weblibrary.db.entity.Book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by artem on 5.2.17.
 */
@XmlRootElement(name = "books")
@XmlAccessorType(XmlAccessType.FIELD)
public class Books {
    @XmlElement(name = "book")
    private List<Book> books = new ArrayList<>();

    public Books() {
    }

    public Books(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books1 = (Books) o;

        return books.equals(books1.books);
    }

    @Override
    public int hashCode() {
        return books.hashCode();
    }

    @Override
    public String toString() {
        return "Books{" +
                "books=" + books +
                '}';
    }
}
