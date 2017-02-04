package local.zone.weblibrary.db.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by artem on 2.2.17.
 */
@Entity
@Table(name = "libraries")
public class Library implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "librarians", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Librarian> librarians = new HashSet<>();
    @OneToMany(mappedBy = "readers", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Reader> readers = new HashSet<>();
    @OneToMany(mappedBy = "books", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Book> books = new HashSet<>();

    public Library() {
    }

    public Library(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Librarian> getLibrarians() {
        return librarians;
    }

    public void setLibrarians(Set<Librarian> librarians) {
        this.librarians = librarians;
    }

    public Set<Reader> getReaders() {
        return readers;
    }

    public void setReaders(Set<Reader> readers) {
        this.readers = readers;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }

    public void removeLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void removeReader(Reader reader) {
        readers.add(reader);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", librarians=" + librarians +
                ", books=" + books +
                '}';
    }
}
