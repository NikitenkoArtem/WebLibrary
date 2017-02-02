package local.zone.weblibrary.db.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by artem on 2.2.17.
 */
public class History implements Serializable {
    private Integer id;
    private Book bookId;
    private Reader readerId;
    private Library libraryId;
    private Boolean isBookComeBack;
}
