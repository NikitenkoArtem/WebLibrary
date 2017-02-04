package local.zone.weblibrary.db.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by artem on 1.2.17.
 */
@Entity
@Table(name = "librarians")
public class Librarian implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Librarian() {
    }

    public Librarian(Library library, Person person) {
        this.library = library;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", library=" + library +
                ", person=" + person +
                '}';
    }
}
