package general.media;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface IBookRepository {

    void load(String uri, String separator) throws ParseException, IOException;

    List<Book> getAll();

    Book getById(int id);

    List<Book> getByTitle(String title);

    List<Book> getByPrice(double price);

    List<Book> getByPublisher(String publisherName); // Bonus

    // Bonus
    void add(Book b);

    void remove(Book b);

    void update(Book b);
}
