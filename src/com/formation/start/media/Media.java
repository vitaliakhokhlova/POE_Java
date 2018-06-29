package com.formation.start.media;

import java.util.ArrayList;

public class Media {

    private static int id = 0;
    private String title;
    private double price;

    private Publisher publisher;
    private ArrayList<Author> authorList;

    public Media(String title, double price, Publisher publisher, ArrayList<Author> authorList) {
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.authorList = authorList;
        ++id;
    }


    public double getPrice() {
        return price;
    }

    public double getNetPrice(){
        return price*1.2;
    };

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                ", price=" + price +
                ", publisher={" + publisher +"}";
    }
}
