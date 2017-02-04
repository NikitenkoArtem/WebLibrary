package local.zone.weblibrary.db.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by artem on 1.2.17.
 */

@Entity
@Table(name = "readers")
public class Reader implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Reader() {
    }

    public Reader(Person person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", person=" + person +
                '}';
    }
}
