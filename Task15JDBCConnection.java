
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task15JDBCConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/LibraryDB";
        String username = "root";
        String password = "@Anujanaik09";

        try {
            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Database connected successfully!");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Books");

            System.out.println("\nLibrary Books:");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("book_id") + " | " +
                                rs.getString("title") + " | " +
                                rs.getString("author") + " | " +
                                rs.getString("status"));
            }

            rs.close();
            stmt.close();
            con.close();

            System.out.println("\nConnection closed successfully.");

        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
