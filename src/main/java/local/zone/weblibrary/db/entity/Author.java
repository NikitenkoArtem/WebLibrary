package local.zone.weblibrary.db.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by artem on 1.2.17.
 */
public class Author extends Person implements Serializable {
    private Integer authorId;
    private Integer isbn;

    public Author() {
    }

    public Author(Integer authorId, Integer isbn) {
        this.authorId = authorId;
        this.isbn = isbn;
    }

    public Author(Integer personId, String firstName, String lastName, String middleName, String sex, Date birthDate, String phoneNumber, String email, Address address, String nationality, Passport passport, String placeOfBirth) {
        super(firstName, lastName, middleName, sex, birthDate, phoneNumber, email, address, passport);
    }

    public Author(Integer personId, String firstName, String lastName, String middleName, String sex, Date birthDate, String phoneNumber, String email, Address address, String nationality, Passport passport, String placeOfBirth, Integer authorId, Integer isbn) {
        super(firstName, lastName, middleName, sex, birthDate, phoneNumber, email, address, passport);
        this.authorId = authorId;
        this.isbn = isbn;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }
}
