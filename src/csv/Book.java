package general.csv;

public class Book extends Media {

    private int nbpage = 0;

    public Book() {
    }

    public Book(String title, double price, Publisher publisher, int nbpage) {
        super(title, price, publisher);
        this.nbpage = nbpage;
    }

    @Override
    public double getNetPrice() {
        return getPrice() * 1.05;
    }

    public int getNbpage() {
        return nbpage;
    }

    public void setNbpage(int nbpage) {
        this.nbpage = nbpage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nbpage=" + nbpage
                ;
    }
}
