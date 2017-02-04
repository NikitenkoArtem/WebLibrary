package local.zone.weblibrary.db.dao.impl;

import local.zone.weblibrary.db.dao.LibraryDao;
import local.zone.weblibrary.db.entity.Library;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by artem on 4.2.17.
 */
public class LibraryDaoImpl implements LibraryDao<Library, Long> {
    private SessionFactory sessionFactory;

    @Override
    public Long create(Library entity) {
        return null;
    }

    @Override
    public Library read(Long id) {
        return null;
    }

    @Override
    public List<Library> readAll() {
        return sessionFactory.getCurrentSession().createQuery("from libraries l").list();
    }

    @Override
    public void update(Library entity) {

    }

    @Override
    public void delete(Library entity) {

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
