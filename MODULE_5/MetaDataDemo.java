import java.sql.*;

public class MetaDataDemo {
    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password123");
            DatabaseMetaData dbmd = con.getMetaData();

            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("UserName: " + dbmd.getUserName());
            System.out.println("URL: " + dbmd.getURL());
            System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

            System.out.println("---");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");

            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Total columns: " + rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: " + rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(1));


            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
