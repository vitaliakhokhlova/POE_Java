package general.media;

import java.util.ArrayList;

public class Media {

    private static int compteur = 0;
    private int id = 0;
    private String title;
    private double price;

    private Publisher publisher;
    private ArrayList<Author> authorList;

    public Media() {
    }

    public Media(String title, double price, Publisher publisher, ArrayList<Author> authorList) {
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.authorList = authorList;
        this.id = ++compteur;
    }

    public static int getCompteur() {
        return compteur;
    }

    public double getPrice() {
        return price;
    }

    ;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNetPrice() {
        return price * 1.2;
    }

    @Override
    public String toString() {
        return "id=" + id + '\'' +
                "title='" + title + '\'' +
                ", price=" + price +
                ", publisher={" + publisher + "}";
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

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(ArrayList<Author> authorList) {
        this.authorList = authorList;
    }


}
