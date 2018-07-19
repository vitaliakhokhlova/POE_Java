package general.media;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Medias {

    public static void main(String[] args) throws IOException {

        /*Media book = new Book("Le petit prince",10.00,new Integer("House"),new ArrayList<Author>(Arrays.asList(new Author("Exupéry"))),120);
        System.out.println(book);
        System.out.println(book.getNetPrice());

        Media m = new Media("Nénuphares",1000000,new Integer("Louvre"), new ArrayList<Author>(Arrays.asList(new Author("Monet"))));
        System.out.println(m.getNetPrice());

       /* CD cd = new CD("Queen", 10., new Integer("Music studio"),12);
        System.out.println(cd.getNetPrice());

        DVD dvd = new DVD("Magnolia", 10, new Integer("USA"),"Europe");
        System.out.println(dvd.getNetPrice());*/

        //Media book2 = new Book("Capital", 20, new Integer("Marx"),300);
        //Book book3 = new Media("Bible",20);
        //System.out.println(((Book) book2).getNbpage());*/

        BookRepository bookRepository = new BookRepository();
        bookRepository.load("Livres.csv", ";");
        //bookRepository.print();
        Book book = new Book("Над пропастью во ржи", 20, new Publisher("Дом печати"), new ArrayList<Author>(Collections.singletonList(new Author("Сэлинджер"))), 105);
        bookRepository.add(book);
        //bookRepository.print();
        bookRepository.remove(book);
        bookRepository.print();
        //System.out.println(bookRepository.getByPrice(20));
    }
}
