import java.sql.* ;

public class ScrollableResultSetDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.17.0.2:1521:xe", "system",
            "password123");

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = stmt.executeQuery("select N, C, NU from student");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }


            System.out.println("Moving to last row");
            rs.last();

            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

            System.out.println("Moving to first row");
            rs.first();
            System.out.println("First row: " + rs.getRow());

            System.out.println("Moving to 2nd row relative to current row");
            System.out.println("Current row: " + rs.getRow());
            rs.relative(1);
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        
            
            // update first row
            rs.updateString(2, "Updated");
            rs.updateRow();
            System.out.println("Updated first row value");
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));


            System.out.println("Moving to 2nd row");
            rs.absolute(2);
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            // delete 2nd row
            rs.deleteRow();
            System.out.println("Deleted 2nd row");

            }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
