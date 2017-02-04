package local.zone.weblibrary.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by artem on 1.2.17.
 */
@Entity
@Table(name = "passports")
public class Passport implements Serializable {
    @Id
    @Column
    private String id;
    @Column(name = "passport_number", unique = true, nullable = false)
    private String passportNumber;
    @Column
    private String type;
    @Column(name = "code_of_issuing_state")
    private String codeOfIssuingState;
    @Column
    private String authority;
    @Column
    private String nationality;
    @Column(name = "place_of_birth")
    private String placeOfBirth;
    @Column(name = "date_of_issue")
    private Date dateOfIssue;
    @Column(name = "date_of_expiry")
    private Date dateOfExpiry;

    public Passport() {
    }

    public Passport(String id, String passportNumber) {
        this.id = id;
        this.passportNumber = passportNumber;
    }

    public Passport(String id, String passportNumber, String type, String codeOfIssuingState, String authority, String nationality, String placeOfBirth, Date dateOfIssue, Date dateOfExpiry) {
        this.id = id;
        this.passportNumber = passportNumber;
        this.type = type;
        this.codeOfIssuingState = codeOfIssuingState;
        this.authority = authority;
        this.nationality = nationality;
        this.placeOfBirth = placeOfBirth;
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCodeOfIssuingState() {
        return codeOfIssuingState;
    }

    public void setCodeOfIssuingState(String codeOfIssuingState) {
        this.codeOfIssuingState = codeOfIssuingState;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(Date dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", type='" + type + '\'' +
                ", codeOfIssuingState='" + codeOfIssuingState + '\'' +
                ", authority='" + authority + '\'' +
                ", nationality='" + nationality + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", dateOfIssue=" + dateOfIssue +
                ", dateOfExpiry=" + dateOfExpiry +
                '}';
    }
}
