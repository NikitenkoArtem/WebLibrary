package local.zone.weblibrary.db.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by artem on 1.2.17.
 */

@Entity
@Table(name = "readers")
public class Reader extends Person implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private History history;
}
