// https://www.tutorialspoint.com/jdbc/jdbc-transactions.htm

import java.sql.* ;

public class TransactionProcessingDemo {
    public static void main(String[] args) throws SQLException{
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password123");
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();

            stmt.executeUpdate("insert into student values(1, 'Raj', 23)");

            // Uncomment the following line to test rollback
            // stmt.executeUpdate("inserted into student values(2, 'Ramesh', 24)");

            con.commit();

            con.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Oops! Something went wrong. Rolling back changes.");

            con.rollback();
        }
    }
}
