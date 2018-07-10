package general.media;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BookRepository implements IBookRepository {

    BufferedReader reader;
    int nLines;
    int nColumns;

    ArrayList<Book> bookList = new ArrayList<>();

    @Override
    public void load(String uri, String separator) throws IOException {

        this.reader = new BufferedReader(new FileReader(uri));
        reader.readLine();
        String line;
        int i = 0;
        while ((line = reader.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, separator);
            int id = Integer.parseInt(st.nextToken());
            String title = st.nextToken();
            double price = Double.parseDouble(st.nextToken());
            int nPage = Integer.parseInt(st.nextToken());
            Publisher publisher = new Publisher(st.nextToken());
            Book book = new Book(title, price, publisher, null, nPage);
            bookList.add(book);
            i++;
        }

        this.nLines = i;
        this.reader.close();

    }

    @Override
    public List<Book> getAll() {
        return bookList;
    }

    @Override
    public Book getById(int id) {
        Book book = new Book();
        for (Book b : bookList) {
            if (b.getId() == id) {
                book = b;
                break;
            }
        }
        return book;
    }

    @Override
    public List<Book> getByTitle(String title) {
        title = title.toLowerCase();
        List<Book> bookByTitle = new ArrayList<>();
        for (Book b : bookList) {
            String bookTitle = b.getTitle().toLowerCase();
            if (bookTitle.contains(title)) {
                bookByTitle.add(b);
            }
        }
        return bookByTitle;
    }

    @Override
    public List<Book> getByPrice(double price) {
        List<Book> bookByPrice = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getPrice() <= price) {
                bookByPrice.add(b);
            }
        }
        return bookByPrice;
    }

    @Override
    public List<Book> getByPublisher(String publisherName) {
        List<Book> bookByPublisher = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getPublisher().getName().equals(publisherName)) {
                bookByPublisher.add(b);
            }
        }
        return bookByPublisher;
    }

    @Override
    public void add(Book b) {
        bookList.add(new Book(b.getTitle(), b.getPrice(), b.getPublisher(), b.getAuthorList(), b.getNbpage()));
    }

    @Override
    public void remove(Book b) {
    }

    @Override
    public void update(Book b) {
        for (Book c : bookList) {
            if (c.getId() == b.getId()) {
                c.setNbpage(b.getNbpage());
                c.setPublisher(b.getPublisher());
                c.setPrice(b.getPrice());
                c.setTitle(b.getTitle());
                c.setAuthorList(b.getAuthorList());
            }
        }
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "reader=" + reader +
                ", nLines=" + nLines +
                ", nColumns=" + nColumns +
                ", bookList=" + bookList +
                '}';
    }


    public void print() {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}
