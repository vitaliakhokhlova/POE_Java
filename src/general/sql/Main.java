package general.sql;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        BookRepositorySQL bookRepositorySQL = new BookRepositorySQL();
        System.out.println(bookRepositorySQL.getByPrice(20));
    }


}
