package com.vita.khokhlova.JPA;

import com.vita.khokhlova.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class BookRepository {

    private EntityManager em = EntityManagerFactorySingleton.getEntityManager();

    public List<Book> getAll(){
        return em.createQuery("select b from Book b").getResultList();
    }

    public Book getById(int id) {
        return  em.find(Book.class,id);
    }

    public void deleteBook(int id) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Book b = em.find(Book.class, id);
        if (b != null) {
            em.remove(b);
        }
        tx.commit();
    }

    public void createBook(Book book) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(book);
            tx.commit();
        }
        catch (Exception e) {
            tx.rollback();
        }
    }

    public void updateBook(Book book) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.persist(em.merge(book));
            tx.commit();
        }
        catch (Exception e) {
            tx.rollback();
        }
    }
}
