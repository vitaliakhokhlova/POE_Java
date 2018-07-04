package com.formation.start.media;

import java.util.ArrayList;

public class Book extends Media {

    private int nbpage = 0;

    public Book(){}

    public Book(String title, double price, Publisher publisher, ArrayList<Author> authorList, int nbpage) {
        super(title, price, publisher, authorList);
        this.nbpage = nbpage;
    }

    @Override
    public double getNetPrice() {
        return getPrice()*1.05;
    }

    public int getNbpage() {
        return nbpage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nbpage=" + nbpage
                ;
    }

    public void setNbpage(int nbpage) {
        this.nbpage = nbpage;
    }


}
