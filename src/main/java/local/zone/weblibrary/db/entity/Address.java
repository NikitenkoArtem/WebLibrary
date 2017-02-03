package local.zone.weblibrary.db.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by artem on 1.2.17.
 */
@Entity
@Table(name = "addresses")
public class Address implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String street;
    @Column(name = "house_number", nullable = false)
    private Integer houseNumber;
    @Column(name = "apartment_complex")
    private Integer apartmentComplex;
    @Column(name = "flat_number")
    private Integer flatNumber;


}
