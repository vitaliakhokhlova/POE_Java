package com.vita.khokhlova.JPA;

import com.vita.khokhlova.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.List;

public class AuthorRepository {

    private EntityManager em = EntityManagerFactorySingleton.getEntityManager();

    public List<Author> getAll(){
        return em.createQuery("select a from Atuhor a").getResultList();
    }

    public Author getById(int id) {
        return  em.find(Author.class,id);
    }
}
