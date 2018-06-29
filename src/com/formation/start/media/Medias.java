package com.formation.start.media;

import java.util.ArrayList;
import java.util.Arrays;

public class Medias {

    public static void main(String[] args) {

        Media book = new Book("Le petit prince",10.00,new Publisher("House"),new ArrayList<Author>(Arrays.asList(new Author("Exupéry"))),120);
        System.out.println(book);
        System.out.println(book.getNetPrice());

        Media m = new Media("Nénuphares",1000000,new Publisher("Louvre"), new ArrayList<Author>(Arrays.asList(new Author("Monet"))));
        System.out.println(m.getNetPrice());

       /* CD cd = new CD("Queen", 10., new Publisher("Music studio"),12);
        System.out.println(cd.getNetPrice());

        DVD dvd = new DVD("Magnolia", 10, new Publisher("USA"),"Europe");
        System.out.println(dvd.getNetPrice());*/

        //Media book2 = new Book("Capital", 20, new Publisher("Marx"),300);
        //Book book3 = new Media("Bible",20);
        //System.out.println(((Book) book2).getNbpage());
    }
}
