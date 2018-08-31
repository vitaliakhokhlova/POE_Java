package com.vita.khokhlova.JPA;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;

    @OneToMany(
            mappedBy = "publisher",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnoreProperties("publisher")
    private List<Book> bookList = new ArrayList<>();

    public Publisher(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @JsonIgnoreProperties("publisher")
//    public List<Book> getBookList() {
//        return bookList;
//    }
//
//    @JsonIgnoreProperties("publisher")
//    public void setBookList(List<Book> bookList) {
//        this.bookList = bookList;
//    }
}
