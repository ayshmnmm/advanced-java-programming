import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcExample {
    public static void main(String[] args) {
        try {
            // load driver (now done automatically)
            // Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.17.0.2:1521:free", "C##ayush",
                    "test123");

            // Create and execute SQL statement
            Statement stmt = con.createStatement();
            int affectedRows = stmt.executeUpdate("insert into student values(3, 'Harish', 2303)");
            System.out.println("Affected Rows: " + affectedRows);
            ResultSet rs = stmt.executeQuery("select * from student");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
