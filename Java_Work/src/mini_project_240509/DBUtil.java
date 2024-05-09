package mini_project_240509;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    static String driver = "oracle.jdbc.driver.OracleDriver"; 
    static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    static String userid = "scott";
    static String passwd = "tiger";
    
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, userid, passwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Database Connection Failed");
        }
    }
}