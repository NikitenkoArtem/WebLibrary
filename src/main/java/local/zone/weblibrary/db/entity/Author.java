package local.zone.weblibrary.db.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by artem on 1.2.17.
 */

@Entity
@Table(name = "authors")
@XmlAccessorType(XmlAccessType.FIELD)
public class Author implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "person_id")
    @OneToOne(mappedBy = "persons")
    @XmlElement
    private Person person;

    public Author() {
    }

    public Author(Person person) {
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
        return "Author{" +
                "id=" + id +
                ", person=" + person +
                '}';
    }
}
