package general.sql;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        BookRepositorySQL bookRepositorySQL = new BookRepositorySQL();
        System.out.println(bookRepositorySQL.getByPrice(20));
        bookRepositorySQL.add(new Book(10,"The Unbearable Lightness of Being",30));
        System.out.println(bookRepositorySQL.getByTitle("unb"));
    }


}
