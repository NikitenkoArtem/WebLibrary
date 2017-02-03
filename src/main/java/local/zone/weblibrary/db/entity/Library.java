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

    public Library() {
    }

    public Library(String name, Set<Librarian> librarians) {
        this.name = name;
        this.librarians = librarians;
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

    public void addLibrarian(Librarian librarian) {

    }

    public void removeLibrarian(Librarian librarian) {

    }
}
