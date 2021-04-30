package csc174project.Flowershop;

import javax.swing.*;
import java.awt.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         System.setProperty("java.awt.headless", "false");
    	 JFrame frame = new JFrame("Hello World Java Swing");

         // set frame site
         frame.setMinimumSize(new Dimension(800, 600));
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         // center the JLabel
         JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);

         // add JLabel to JFrame
         frame.getContentPane().add(lblText);

         // display it
         frame.pack();
         frame.setVisible(true);
    }
}
