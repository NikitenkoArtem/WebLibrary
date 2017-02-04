package local.zone.weblibrary.db.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by artem on 4.2.17.
 */
public interface GenericDao<E extends Serializable, PK> {
    PK create(E entity);
    E read(PK id);
    List<E> readAll();
    void update(E entity);
    void delete(E entity);
}
