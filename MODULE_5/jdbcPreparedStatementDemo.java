import java.sql.* ;

public class jdbcPreparedStatementDemo {
    public static void main(String[] args) {
        try {
            // load driver (now done automatically)
            // Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password123");

            // Create and execute SQL statement
            PreparedStatement stmt = con.prepareStatement("insert into student values(?, ?, ?)");

            stmt.setInt(1, 3);
            stmt.setString(2, "Ram");
            stmt.setInt(3, 2303);

            int affectedRows = stmt.executeUpdate();
            System.out.println("Affected Rows: " + affectedRows);

            // Terminate connection
            con.close();
        }
        catch (SQLException e) {
            System.out.println("SQL! Exception occurred: " + e);
        }
        catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
