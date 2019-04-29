package advanced;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author William
 */
public class PropertiesExample
{
    public static void main (String[] args)
    {
        write ();
        read ();
    }
    
    /**
     * Write properties keys and values to a file
     */
    public static void write ()
    {
        try
        {
            /* Propeties values */
            Properties properties = new Properties ();
            properties.setProperty ("server_name", "metal_gear_solid_snake");
            properties.setProperty ("request_timeout", "5000");
            properties.setProperty ("port", "8080");
            properties.setProperty ("password", "oriquouis_prisken");
            properties.setProperty ("udp_port", "6523");

            /* File */
            try (OutputStream output = new FileOutputStream ("config.properties"))
            {
                properties.store (output, null);
                System.out.println ("Properties saved");
            }
        }
        catch (IOException e)
        {
            System.out.println (e.getLocalizedMessage ());
        }
    }
    
    /**
     * Read properties values
     */
    public static void read ()
    {
        try
        {
            /* File */
            try (InputStream input = new FileInputStream ("config.properties"))
            {
                Properties properties = new Properties ();
                properties.load (input);

                /* Values */
                String serverName = properties.getProperty ("server_name");
                String port = properties.getProperty ("port");
                String password = properties.getProperty ("password");
                String request_timeout = properties.getProperty ("request_timeout");
                String udp_port = properties.getProperty ("udp_port");

                /* Output */
                System.out.println ("SERVER NAME: " + serverName);
                System.out.println ("PORT: " + port);
                System.out.println ("PASSWORD: " + password);
                System.out.println ("REQUEST TIMEOUT: " + request_timeout);
                System.out.println ("UDP PORT: " + udp_port);
            }
        }
        catch (IOException e)
        {
            System.out.println (e.getLocalizedMessage ());
        }
    }
    
    // </editor-fold>
}
