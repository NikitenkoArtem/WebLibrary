package local.zone.weblibrary.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by artem on 1.2.17.
 */
@Entity
@Table(name = "books")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book implements Serializable {
    @Id
    @Column
    @XmlElement
    private Long isbn;
    @Column(unique = true)
    @XmlElement
    private Integer lbc;
    @Column(unique = true)
    @XmlElement
    private Integer udc;
    @Column(nullable = false)
    @XmlElement
    private String name;
    @Column
    @XmlElement
    private Author author;
    @Column
    @XmlElement
    private String publisher;
    @Column(name = "publish_date")
    @XmlElement
    private Date publishDate;
    @Column(name = "page_amount")
    @XmlElement
    private Integer pageAmount;

    public Book() {
    }

    public Book(Long isbn, String name) {
        this.isbn = isbn;
        this.name = name;
    }

    public Book(Long isbn, Integer lbc, Integer udc, String name, Author author, String publisher, Date publishDate, Integer pageAmount) {
        this.isbn = isbn;
        this.lbc = lbc;
        this.udc = udc;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.pageAmount = pageAmount;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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

    public Integer getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(Integer pageAmount) {
        this.pageAmount = pageAmount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", lbc=" + lbc +
                ", udc=" + udc +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", publisher='" + publisher + '\'' +
                ", publishDate=" + publishDate +
                ", pageAmount=" + pageAmount +
                '}';
    }
}
