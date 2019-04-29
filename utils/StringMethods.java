package utils;

/**
 * @author William
 */
public class StringMethods
{
    public static void main (String[] args)
    {
        /* Original phrase */
        String phrase = "London Bridge is falling down, falling down, falling down, London Bridge is falling down, my fair lady ";
        System.out.println (phrase);
        
        /* Uppercase */
        phrase = phrase.toUpperCase ();
        System.out.println ("UpperCase: " + phrase);
        
        /* Lowercase */
        phrase = phrase.toLowerCase ();
        System.out.println ("LowerCase: " + phrase);
        
        /* String length */
        System.out.println ("length: " + phrase.length ());
        
        /* Verification in start / end */
        System.out.printf ("Phrash %s with 'london' \n", phrase.startsWith ("london") ? "does start" : "doesn't start");
        System.out.printf ("Phrash %s with 'bridge' \n", phrase.endsWith ("bridge") ? "does end" : "doesn't end");
        
        /* Comparing Strings */
        System.out.printf ("'London' is equal to 'London'? %s \n", "London".compareTo ("London") == 0 ? "Yes" : "No");
        
        /* Index of first ocorrence */
        System.out.printf ("Index of first ocorrence of 'london' = %d \n", phrase.indexOf ("london"));
        
        /* Index of last ocorrence */
        System.out.printf ("Index of last ocorrence of 'london' = %d \n", phrase.lastIndexOf ("london"));
        
        /* Replace substring */
        phrase = phrase.replace ("london", "manchester");
        System.out.println (phrase);
        
        /* Get substring and concatenates */
        phrase = phrase.substring (phrase.lastIndexOf ("falling"), phrase.lastIndexOf ("down") + 4);
        System.out.println ("Because I'm ".concat (phrase));
        
        /* Verify if is empty */
        System.out.printf ("phrase is empty? %s \n", phrase.isEmpty () ? "Yes" : "No");
        
        /* Cuts white space */
        phrase = phrase.trim ();
        System.out.printf ("phrase without spaces: %s \n", phrase);
        
        /* Splits into array */
        String[] characters = phrase.split ("");
        for (String c : characters)
        {
            System.out.println (c);
        }
    }
}