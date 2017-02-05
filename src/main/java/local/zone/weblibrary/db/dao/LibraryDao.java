package local.zone.weblibrary.db.dao;

import local.zone.weblibrary.db.entity.Library;

import java.io.Serializable;

/**
 * Created by artem on 4.2.17.
 */
public interface LibraryDao extends GenericDao<Library, Long> {
    Library findLibraryByName(String name);
}
