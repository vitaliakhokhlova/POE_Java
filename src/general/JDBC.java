package general;


import java.sql.*;


public class JDBC {

    public static void main(String[] args) {
        String driverName = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        try {
            Class.forName(driverName);
            Connection connection = DriverManager.getConnection(url, "postgres", "geibcnfz");
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from book");
            while (rs.next()) {
                String title = rs.getString("title");
                System.out.println(title);
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}