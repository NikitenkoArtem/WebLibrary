package local.zone.weblibrary.db.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by artem on 2.2.17.
 */
@Entity
@Table(name = "history")
@XmlRootElement(name = "history")
@XmlAccessorType(XmlAccessType.FIELD)
public class History implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reader_id", nullable = false)
    @OneToOne
    @XmlAttribute
    private Reader reader;
    @Column(name = "book_id", nullable = false)
    @OneToMany
    @XmlElement
    private Book book;
    @Column(name = "is_book_come_back", nullable = false)
    @XmlElement
    private Boolean isBookComeBack;
    @OneToMany(mappedBy = "books", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Book> books = new HashSet<>();

    public History() {
    }

    public History(Reader reader, Book book, Boolean isBookComeBack) {
        this.reader = reader;
        this.book = book;
        this.isBookComeBack = isBookComeBack;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Boolean getBookComeBack() {
        return isBookComeBack;
    }

    public void setBookComeBack(Boolean bookComeBack) {
        isBookComeBack = bookComeBack;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", reader=" + reader +
                ", book=" + book +
                ", isBookComeBack=" + isBookComeBack +
                '}';
    }
}
