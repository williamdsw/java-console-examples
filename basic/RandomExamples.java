package basic;

import java.util.Random;

/**
 * @author William
 */
public class RandomExamples
{
    public static void main (String[] args)
    {
        Random random = new Random ();
        
        /* Integer */
        System.out.println ("\n===== 10 Random Integers =====");
        for (int i = 0; i < 10; i++)
        {
            System.out.println (random.nextInt ());
        }
        
        /* Long */
        System.out.println ("\n===== 10 Random Longs =====");
        for (int i = 0; i < 10; i++)
        {
            System.out.println (random.nextLong ());
        }
        
        /* Float */
        System.out.println ("\n===== 10 Random Floats =====");
        for (int i = 0; i < 10; i++)
        {
            System.out.println (random.nextFloat ());
        }
        
        /* Double */
        System.out.println ("\n===== 10 Random Doubles =====");
        for (int i = 0; i < 10; i++)
        {
            System.out.println (random.nextDouble ());
        }
    }
}