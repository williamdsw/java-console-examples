package interfaces;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author William
 */
public class SwingFlowLayout
{
    public static void main (String[] args)
    {
        JFrame jframe = new JFrame ("Flow Layout Example");
        
        /* JButtons */
        JButton btnSum = new JButton ("Sum");
        JButton btnSubstract = new JButton ("Susbtract");
        JButton btnMultiply = new JButton ("Multiply");
        JButton btnDivide = new JButton ("Divide");
        JButton btnModulus = new JButton ("Modulus");
        
        /* Adding buttons */
        jframe.add (btnSum);
        jframe.add (btnSubstract);
        jframe.add (btnMultiply);
        jframe.add (btnDivide);
        jframe.add (btnModulus);
        
        /* JFrame properties */
        jframe.setLayout (new FlowLayout ());
        jframe.setSize (500, 500);
        jframe.setLocation (400, 50);
        jframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        jframe.setVisible (true);
    }
}
