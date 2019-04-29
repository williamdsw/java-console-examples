package basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author William
 */
public class TryWithResources
{
    public static void main (String[] args)
    {
        createFile ();
        readFile ();
    }
    
    /**
     * Creates an file
     */
    private static void createFile ()
    {
        try
        {
            /* Content */
            StringBuilder builder = new StringBuilder ();
            builder.append ("London Bridge is falling down,\n");
            builder.append ("Falling down, falling down.\n");
            builder.append ("London Bridge is falling down,\n");
            builder.append ("My fair lady.");

            try (FileWriter writer = new FileWriter ("my-file.txt"))
            {
                writer.append (builder);
            }
            
            System.out.println ("File created");
        }
        catch (IOException e)
        {
            System.out.println (e.getMessage ());
        }
    }
    
    private static void readFile ()
    {
        try
        {
            String line = "";
            
            /* Read */
            try (FileReader fileReader = new FileReader ("my-file.txt"))
            {
                try (BufferedReader bufferedReader = new BufferedReader (fileReader))
                {
                    while ((line = bufferedReader.readLine ()) != null)
                    {
                        System.out.println (line);
                    }
                }
            }
            
            /* Delete */
            File file = new File ("my-file.txt");
            file.delete ();
            System.out.println ("File readed and deleted.");
        }
        catch (IOException e)
        {
            System.out.println (e.getMessage ());
        }
    }
}