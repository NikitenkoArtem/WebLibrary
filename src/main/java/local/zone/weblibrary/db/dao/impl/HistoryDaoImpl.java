package local.zone.weblibrary.db.dao.impl;

import local.zone.weblibrary.db.dao.HistoryDao;
import local.zone.weblibrary.db.entity.History;

import java.util.List;

/**
 * Created by artem on 5.2.17.
 */
public class HistoryDaoImpl implements HistoryDao {

    @Override
    public Long create(History entity) {
        return null;
    }

    @Override
    public History read(Long id) {
        return null;
    }

    @Override
    public List<History> readAll() {
        return null;
    }

    @Override
    public void update(History entity) {

    }

    @Override
    public void delete(History entity) {

    }

    @Override
    public History findByReaderId(Long id) {
        return null;
    }

    @Override
    public History findByReaderName(String readerFirstName, String readerLastName) {
        return null;
    }
}
