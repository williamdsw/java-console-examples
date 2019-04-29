package basic;

import java.util.Random;

/**
 * @author William
 */
public class Arrays
{
    public static void main (String[] args)
    {
        String[] teams = new String[] { "Corinthians", "Palmeiras", "Santos", "São Paulo" };
        int[] numbers = new int[10];
        
        /* Defined array */
        System.out.println ("===== Teams =====");
        
        for (String team : teams)
        {
            System.out.println (team);
        }
        
        /* Fill empty array */
        System.out.println ("===== Random Numbers =====");
        
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = new Random ().nextInt (50);
            System.out.printf ("%d was added to array \n", numbers[i]);
        }
    }
}