package interfaces;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author William
 */
public class SwingGridLayout
{
    public static void main (String[] args)
    {
        JFrame jframe = new JFrame ();
        
        /* Buttons */
        JButton btnFirst = new JButton ("First");
        JButton btnSecond = new JButton ("Second");
        JButton btnThird = new JButton ("Third");
        JButton btnFourth = new JButton ("Fourth");
        JButton btnFifth = new JButton ("Fifth");
        JButton btnSixth = new JButton ("Sixth");
        
        /* Adding buttons to JFrame */
        jframe.add (btnFirst);
        jframe.add (btnSecond);
        jframe.add (btnThird);
        jframe.add (btnFourth);
        jframe.add (btnFifth);
        jframe.add (btnSixth);
        
        /* JFrame properties */
        jframe.setLayout (new GridLayout (2, 3));
        jframe.setTitle ("Grid Layout Example");
        jframe.setSize (600, 600);
        jframe.setLocation (400, 50);
        jframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        jframe.setVisible (true);
    }
}
