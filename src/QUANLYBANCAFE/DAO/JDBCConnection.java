package QUANLYBANCAFE.DAO;
import java.sql.*;

/**
 *
 * @author anreal
 */
public class JDBCConnection {
    static final String passWord = "08052004";
    static final String dataBaseName = "QUANLYCAFE";
    static final String user = "sa";
    
    public static Connection getJDBCConnection(){
        Connection conn = null;
        try {
            String url = "jdbc:sqlserver://DESKTOP-R4TO9PD\\ADMIN:1433;"
                    + "user="+user+";password="+passWord+";databaseName="+dataBaseName+";"
                    + "encrypt=true;trustServerCertificate=true";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            conn =  DriverManager.getConnection(url);

            System.out.println("Connection to database successful!!!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }    
        return conn;
    }
    
    public static void main(String[] args) {
        Connection connection = getJDBCConnection();
    }
}
