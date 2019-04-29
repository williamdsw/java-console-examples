package interfaces;

import javax.swing.JFrame;

/**
 * @author William
 */
public class SwingJFrame
{
    public static void main (String[] args)
    {
        /* JFrame properties */
        JFrame jframe = new JFrame ();
        jframe.setTitle ("Any title");
        jframe.setSize (800, 600);
        jframe.setLocation (300, 50);
        jframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        jframe.setResizable (false);
        jframe.setVisible (true);
    }
}
