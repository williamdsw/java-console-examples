package utils;

/**
 * @author William
 */
public class StringBuilderExample
{
    public static void main (String[] args)
    {
        /* StringBuffer, StringBuilder ... */
        StringBuilder builder = new StringBuilder ("London Bridge");
        System.out.println (builder.toString ());
        
        /* Concat to builder */
        System.out.println (builder.append (" is falling down.").toString ());
        
        /* Inserts content at specified index */
        System.out.println (builder.insert (17, "not ").toString ());
        
        /* Delete 'n' characters at specified index */
        System.out.println (builder.delete (7, 13).toString ());
        
        /* Delete an character at specified index */
        System.out.println (builder.deleteCharAt (builder.length () - 1).toString ());
        
        /* Replace content based on begin and end indexes */
        System.out.println (builder.replace (0, 6, "Manchester"));
        
        /* Capacity & length */
        System.out.printf ("Capacity: %d \n", builder.capacity ());
        System.out.printf ("Length: %d \n", builder.length ());
    }
}