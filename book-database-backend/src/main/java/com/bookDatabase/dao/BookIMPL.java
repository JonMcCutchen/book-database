package com.bookDatabase.dao;

import com.bookDatabase.entity.Book;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class BookIMPL implements BookDAO {
    private final EntityManager entityManager;

    @Autowired
    public BookIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Book> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Book> myQuery = currentSession.createQuery("from Book");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Book findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Book.class , theId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Book theBook) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theBook);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Book theBook = currentSession.get(Book.class, theId);
        currentSession.delete(theBook);
    }
}
