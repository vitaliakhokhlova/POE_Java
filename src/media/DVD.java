package general.media;

import java.util.ArrayList;

public class DVD extends Media {
    private int zone;

    public DVD(String title, double price, Publisher publisher, ArrayList<Author> authorList, int zone) {
        super(title, price, publisher, authorList);
        this.zone = zone;
    }

    @Override
    public double getNetPrice() {
        return getPrice() * 0.8;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }
}
