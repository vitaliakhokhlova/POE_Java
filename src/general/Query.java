package general;

import java.sql.*;

public class Query {

    public static ResultSet getQuery(String driverName, String url, String user, String password, String query) {
        try {
            Class.forName(driverName);
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            connection.close();
            return rs;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}