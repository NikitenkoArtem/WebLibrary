package local.zone.weblibrary.db.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by artem on 1.2.17.
 */
public class Passport implements Serializable {
    private String passportNumber;
    private String type;
    private String codeOfIssuingState;
    private String authority;
    private Date dateOfIssue;
    private Date dateOfExpiry;
}
