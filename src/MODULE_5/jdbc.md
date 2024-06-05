# JDBC

Java Database Connectivity (JDBC) is a Java API that allows Java programs to access and interact with databases. JDBC is a part of the Java Standard Edition (SE) platform and is included in the Java Development Kit (JDK).
<!-- 
## The 5 main steps

0. **Imports**
```java
import java.sql.*;
```

1. **Load JDBC driver**
```java
Class.forName("oracle.jdbc.driver.OracleDriver");
```

2. **Connect to Database**
```java
// jdbc:oracle:thin:@localhost:1521:xe for xpress edition
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:free", "username","password");
```

3. **Create and execute Statements**
```java
Statement stmt = con.createStatement();
int affectedRows = stmt.executeUpdate("insert into student values(3, 'Harish', 2303)");
System.out.println("Affected Rows: " + affectedRows);
ResultSet rs = stmt.executeQuery("select * from student");
```

4. **Process data returned by DBMS**
```java
while (rs.next()) {
    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
}
```

5. **Close connection**
```java
con.close();
``` -->

Example to query a database:

```java
{{#include ../../MODULE_5/jdbcExample.java}}
```

## Exceptions thrown

- **ClassNotFoundException**: thrown when Class.forName("invalid.classname");
- **SQLException**:


<https://devdocs.io/openjdk~21/java.sql/java/sql/drivermanager>
