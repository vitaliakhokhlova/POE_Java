package com.vita.khokhlova.JPA;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="book")
public class Book extends Media {

    private int nbpage;
    @ManyToOne
    @JoinColumn(name = "publisherid", referencedColumnName = "id")
    @JsonIgnoreProperties("bookList")
    private Publisher publisher;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
    private Set<Author> authors;

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Book() {
    }

    public int getNbpage() {
        return nbpage;
    }

    public void setNbpage(int nbpage) {
        this.nbpage = nbpage;
    }

//    @Override
//    public String toString() {
//        String s = super.toString();
//        return s +
//                ": Book{nbpage=" + nbpage +
//                '}';
//    }


    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
