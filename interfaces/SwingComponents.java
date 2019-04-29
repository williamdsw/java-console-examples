package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author William
 */
public class SwingComponents
{
    public static void main (String[] args)
    {
        JFrame jframe = new JFrame ();
        
        /* Name's label */
        JLabel lblName = new JLabel ();
        lblName.setText ("Your name:");
        lblName.setBounds (10, 10, 100, 100);
        
        /* Name's text field */
        JTextField txtNome = new JTextField ();
        txtNome.setBounds (110, 50, 130, 30);
        
        /* Button */
        JButton btnSend = new JButton ();
        btnSend.setText ("Send");
        btnSend.setBounds (100, 100, 140, 40);
        
        /* Information's label */
        JLabel lblInformation = new JLabel ();
        lblInformation.setBounds (10, 110, 200, 100);
        
        /* Adding to JFrame */
        jframe.add (lblName);
        jframe.add (txtNome);
        jframe.add (btnSend);
        jframe.add (lblInformation);
        
        /* Button listener */
        btnSend.addActionListener (new ActionListener ()
        {
            @Override
            public void actionPerformed (ActionEvent ae)
            {
                String text = (!txtNome.getText ().isEmpty () ? txtNome.getText () + " was send!" : "Type your name!");
                lblInformation.setText (text);
            }
        });
        
        /* JFrame properties */
        jframe.setLayout (null);
        jframe.setSize (300, 300);
        jframe.setLocation (400, 50);
        jframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        jframe.setResizable (false);
        jframe.setVisible (true);
    }
}
