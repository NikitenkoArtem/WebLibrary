package local.zone.weblibrary.db.dao;

import local.zone.weblibrary.db.entity.History;

/**
 * Created by artem on 5.2.17.
 */
public interface HistoryDao extends GenericDao<History, Long> {
    History findByReaderId(Long id);
    History findByReaderName(String readerFirstName, String readerLastName);
}
