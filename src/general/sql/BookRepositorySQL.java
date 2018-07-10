package general.sql;

import general.Query;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookRepositorySQL {

    String driverName =  "org.postgresql.Driver";
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "postgres";
    String password = "geibcnfz";

    private ArrayList<Book> getByQuery(String queryString) throws SQLException {
        ArrayList<Book> bookList = new ArrayList<Book>();
        ResultSet rs = Query.getQuery(driverName, url, user, password, queryString);
        while (rs.next()) {
            Book book = new Book(
                    Integer.parseInt(rs.getString("id")),
                    rs.getString("title"),
                    Double.valueOf(rs.getString("price"))
                    );
            bookList.add(book);
        }
        return bookList;
    }

    private void setByQuery(String queryString) throws SQLException{
        Query query = new Query();
    }

    public ArrayList<Book> getAll() throws SQLException {
        return getByQuery("select * from book");
    }

    public ArrayList<Book> getById(int id) throws SQLException {
        return getByQuery("select * from book where id=" + id);
    }

    public ArrayList<Book> getByTitle(String title) throws SQLException {
        return getByQuery("select * from book where title ILIKE '%" + title + "%'");
    }

    public ArrayList<Book> getByPrice(double price) throws SQLException  {
        return getByQuery("select * from book where price <" + price);
    }

    public void add(Book b) {

    }
}
