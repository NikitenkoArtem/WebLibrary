package local.zone.weblibrary.db.entity;

import java.io.Serializable;

/**
 * Created by artem on 1.2.17.
 */
public class Reader extends Person implements Serializable {
    private Integer id;
    private History history;
}
