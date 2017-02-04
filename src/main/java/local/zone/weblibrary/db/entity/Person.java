package local.zone.weblibrary.db.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by artem on 1.2.17.
 */

@Entity
@Table(name = "persons")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    @XmlElement
    private String firstName;
    @Column(name = "last_name", nullable = false)
    @XmlElement
    private String lastName;
    @Column(name = "middle_name")
    @XmlElement
    private String middleName;
    @Column
    private String sex;
    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "phone_number", unique = true)
    private Integer phoneNumber;
    @Column(unique = true)
    private String email;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToOne(mappedBy = "passports", cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "passport_id")
    private Passport passport;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Person(String firstName, String lastName, Address address, Passport passport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.passport = passport;
    }

    public Person(String firstName, String lastName, String middleName, String sex, Date birthDate, Integer phoneNumber, String email, Address address, Passport passport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.passport = passport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}
