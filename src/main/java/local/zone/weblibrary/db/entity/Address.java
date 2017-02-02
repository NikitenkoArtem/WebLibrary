package local.zone.weblibrary.db.entity;

import java.io.Serializable;

/**
 * Created by artem on 1.2.17.
 */
public class Address implements Serializable {
    private String state;
    private String city;
    private String street;
    private Integer houseNumber;
    private Integer apartmentComplex;
    private Integer flatNumber;

    public Address() {
    }

    public Address(String state, String city, String street, Integer houseNumber, Integer apartmentComplex, Integer flatNumber) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentComplex = apartmentComplex;
        this.flatNumber = flatNumber;
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
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", apartmentComplex=" + apartmentComplex +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
