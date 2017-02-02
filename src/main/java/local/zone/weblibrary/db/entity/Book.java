package local.zone.weblibrary.db.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by artem on 1.2.17.
 */
public class Book implements Serializable {
    private Integer isbn;
    private Integer lbc;
    private Integer udc;
    private String name;
    private Author authorId;
    private String publisher;
    private Date publishDate;
    private Library libraryId;
    private Integer pageAmount;

    public Book() {
    }

    public Book(Integer isbn, Integer lbc, Integer udc, String name, Author authorId, String publisher, Date publishDate, Library libraryId, Integer pageAmount) {
        this.isbn = isbn;
        this.lbc = lbc;
        this.udc = udc;
        this.name = name;
        this.authorId = authorId;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.libraryId = libraryId;
        this.pageAmount = pageAmount;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public Integer getLbc() {
        return lbc;
    }

    public void setLbc(Integer lbc) {
        this.lbc = lbc;
    }

    public Integer getUdc() {
        return udc;
    }

    public void setUdc(Integer udc) {
        this.udc = udc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Author authorId) {
        this.authorId = authorId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Library getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(Library libraryId) {
        this.libraryId = libraryId;
    }

    public Integer getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(Integer pageAmount) {
        this.pageAmount = pageAmount;
    }
}
