package interfaces;

import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author William
 */
public class SwingGraphics
{
    public static void main (String[] args)
    {
        /* Line */
        JPanel line = new JPanel ()
        {
            @Override
            public void paint (Graphics g)
            {
                g.drawLine (10, 10, 200, 300);
            }
        };
        
        /* Oval */
        JPanel oval = new JPanel ()
        {
            @Override
            public void paint (Graphics g)
            {
                g.drawOval (100, 100, 100, 100);
            }
        };
        
        /* Rectangle */
        JPanel rectangle = new JPanel ()
        {
            @Override
            public void paint (Graphics g)
            {
                g.drawRect (10, 10, 100, 100);
            }
        };
        
        /* Polygons */
        JPanel polygons = new JPanel ()
        {
            @Override
            public void paint (Graphics g)
            {
                int xCoordinates[] = {25, 145, 25, 145, 25};
                int yCoordinates[] = {25, 25, 145, 145, 25};
                int dots = 5;
                
                g.drawPolygon (xCoordinates, yCoordinates, dots);
            }
        };
        
        /* Text */
        JPanel text = new JPanel ()
        {
            @Override
            public void paint (Graphics g)
            {
                g.drawString ("Example with drawString ", 10, 10);
            }
        };
        
        /* Add to jFrame */
        JFrame jframe = new JFrame ();
        jframe.add (line);
        jframe.add (oval);
        jframe.add (rectangle);
        jframe.add (polygons);
        jframe.add (text);
        
        /* JFrame properties  */
        jframe.setLayout (new GridLayout (3, 3));
        jframe.setTitle ("Graphics example");
        jframe.setSize (700, 700);
        jframe.setLocation (400, 50);
        jframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        jframe.setVisible (true);
    }
}