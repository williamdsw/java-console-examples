package classes;

/**
 * @author William
 */
public class MethodOverloadExamples
{
    private static class Calculation 
    {
        public int sum (int a, int b)
        {
            return a + b;
        }
        
        public int sum (int a, int b, int c)
        {
            return a + b + c;
        }
        
        public float sum (float a, float b)
        {
            return a + b;
        }
        
        public float sum (float a, float b, float c)
        {
            return a + b + c;
        }
    }
    
    public static void main (String[] args)
    {
        /* Examples */
        Calculation calc = new Calculation ();
        System.out.printf ("First sum: %s \n", calc.sum (10, 10));
        System.out.printf ("Second sum: %s \n", calc.sum (10, 10, 10));
        System.out.printf ("Third sum: %s \n", calc.sum (10.5f, 10.5f));
        System.out.printf ("Fourth sum: %s \n", calc.sum (10.5f, 10.5f, 10.5f));
    }
}