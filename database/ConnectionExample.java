package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author William
 */
public class ConnectionExample
{
    /* Parameters */
    private final String SERVER = "localhost";
    private final String DATABASE = "database";
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String PORT = "3306";
    private final String URL = "jdbc:mysql://%s:%s/%s";
    
    private Connection connection;
    
    /* New instance */
    public ConnectionExample ()
    {
        try
        {
            Class.forName ("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection (getConnectionString (), USER, PASSWORD);
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println (e.getMessage ());
            throw new RuntimeException (e.getMessage ());
        }
    }
    
    /* URL formatter */
    private String getConnectionString ()
    {
        return String.format (URL, SERVER, PORT, DATABASE);
    }
    
    /* Getter */
    public Connection getConnection ()
    {
        return this.connection;
    }
    
    /* Test*/
    public static void main (String[] args)
    {
        try
        {
            ConnectionExample dc = new ConnectionExample ();
        
            if (!dc.getConnection ().isClosed ())
            {
                System.out.println ("Connection opened successfully");
            }
        }
        catch (SQLException e)
        {
            System.out.println (e.getMessage ());
        }
    }
}
