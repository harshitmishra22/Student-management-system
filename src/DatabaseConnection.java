import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/student_management";
        String username = "root";
        String password = "Harshit@5678";

        Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student_management", "root", "Harshit@5678");

        System.out.println("Database connected successfully!");
    }
}