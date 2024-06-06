// https://www.tutorialspoint.com/jdbc/jdbc-batch-processing.htm

import java.sql.*;

public class BatchProcessingDemo {
    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password123");
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();

            stmt.addBatch("insert into student values(1, 'RajBatch', 23)");
            stmt.addBatch("insert into student values(2, 'RamBatch', 24)");
            stmt.addBatch("insert into student values(3, 'RahulBatch', 25)");

            stmt.executeBatch();

            con.commit();

            con.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Oops! Something went wrong. Rolling back changes.");

            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }
}
