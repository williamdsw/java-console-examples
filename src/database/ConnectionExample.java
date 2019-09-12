package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author William
 */
public class ConnectionExample
{
    // Parameters
    private final String SERVER = "localhost";
    private final String DATABASE = "csharp_console_1";
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String PORT = "3306";
    private final String URL = "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC";
    private final String MYSQL_JDBC_DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    
    private Connection connection;
    
    //--------------------------------------------------------------------------------------//
    // CONSTRUCTORS
    
    public ConnectionExample ()
    {
        try
        {
            Class.forName (MYSQL_JDBC_DRIVER_NAME);
            System.out.println (getConnectionString ());
            connection = DriverManager.getConnection (getConnectionString (), USER, PASSWORD);
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println (e.getMessage ());
            throw new RuntimeException (e.getMessage ());
        }
    }
    
    //--------------------------------------------------------------------------------------//
    // GETTERS / SETTERS
    
    public Connection getConnection ()
    {
        return this.connection;
    }
    
    //--------------------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    private String getConnectionString ()
    {
        return String.format (URL, SERVER, PORT, DATABASE);
    }
    
    //--------------------------------------------------------------------------------------//
    
    // Test connection
    public static void main (String[] args)
    {
        try
        {
            ConnectionExample example = new ConnectionExample ();
        
            if (!example.getConnection ().isClosed ())
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