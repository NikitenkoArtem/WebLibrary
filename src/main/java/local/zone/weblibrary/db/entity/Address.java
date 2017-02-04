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

    public Address() {
    }

    public Address(String state, String city, String street, Integer houseNumber) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Address(String state, String city, String street, Integer houseNumber, Integer apartmentComplex, Integer flatNumber) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentComplex = apartmentComplex;
        this.flatNumber = flatNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Integer getApartmentComplex() {
        return apartmentComplex;
    }

    public void setApartmentComplex(Integer apartmentComplex) {
        this.apartmentComplex = apartmentComplex;
    }

    public Integer getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(Integer flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", apartmentComplex=" + apartmentComplex +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
