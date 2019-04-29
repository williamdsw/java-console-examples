package interfaces;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author William
 */
public class SwingBorderLayout
{
    public static void main (String[] args)
    {
        JFrame jframe = new JFrame ("Border Layout Example");
        
        /* Buttons*/
        JButton btnLeft = new JButton ("LEFT");
        JButton btnRight = new JButton ("RIGHT");
        JButton btnTop = new JButton ("TOP");
        JButton btnBottom = new JButton ("BOTTOM");
        JButton btnCenter = new JButton ("CENTER");
        
        /* Adding buttons */
        jframe.add (btnLeft, BorderLayout.WEST);
        jframe.add (btnRight, BorderLayout.EAST);
        jframe.add (btnTop, BorderLayout.NORTH);
        jframe.add (btnBottom, BorderLayout.SOUTH);
        jframe.add (btnCenter, BorderLayout.CENTER);
        
        /* JFrame properties */
        jframe.setSize (600, 600);
        jframe.setLocation (400, 50);
        jframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        jframe.setVisible (true);
    }
}
