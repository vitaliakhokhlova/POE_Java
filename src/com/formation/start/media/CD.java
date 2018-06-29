package com.formation.start.media;

import java.util.ArrayList;

public class CD extends Media {

    private int nbtrack = 0;

    public CD(String title, double price, Publisher publisher, ArrayList<Author> authorList, int nbtrack) {
        super(title, price, publisher, authorList);
        this.nbtrack = nbtrack;
    }

    public int getNbtrack() {
        return nbtrack;
    }

    public void setNbtrack(int nbtrack) {
        this.nbtrack = nbtrack;
    }
}
