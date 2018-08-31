package com.vita.khokhlova.JPA;

import javax.persistence.*;

@MappedSuperclass
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private double price;

//
//    @ManyToOne
//    @JoinColumn(name = "publisherid", referencedColumnName = "id")
//    private Publisher publisher;

    public Media() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNetPrice() {
        return price * 1.2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Publisher getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(Publisher publisher) {
//        this.publisher = publisher;
//    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
