import java.sql.*;

public class SQLExceptionDemo {
    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(":oracle:thin:@localhost:1521:xe", "system", "password123");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("insert into student values(1', 'Raj', 23)"); // error

            con.close();

        } catch (SQLException e) {
            System.out.println("Exception message : "+ e);
            System.out.println("Error code : "+ e.getErrorCode());
            System.out.println("Next exception : "+ e.getNextException());
        }
    }
}
