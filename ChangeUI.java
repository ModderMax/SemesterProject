/**
 * ---------------------------------------------------------------------------
 * File name: ChangeUI.java
 * Project name: Semester Project - Text Based RPG
 * ---------------------------------------------------------------------------
 * Creator's name and email: Maxwell Brown, max@nendal.com
 * Course:  CSCI 1250
 * Creation Date: 11/7/2020 
 * ---------------------------------------------------------------------------
*/
import java.awt.*;

/**
 * text class for identifying the active listener
 * contains the main method to run the program
 *
 * Date created: 11/7/2020
 * 
 * @author Maxwell Brown
 */

public class ChangeUI 
{
    /**
    * Method for setting the type of buttons to boolean 
    * and enabling or disabling them as needed
    *
    * Date created: 11/7/2020
    * 
    * @author Maxwell Brown
    * 
    */
    public static void enableAll(boolean b0, boolean b1, boolean b2, boolean b3, boolean b4, boolean b5,
                            boolean t0, boolean l0, boolean l1, boolean l2)
    {
        text.button0.setEnabled(b0);
        text.button0.setVisible(b0);
        text.button1.setEnabled(b1);
        text.button1.setVisible(b1);
        text.button2.setEnabled(b2);
        text.button2.setVisible(b2);
        text.button3.setEnabled(b3);
        text.button3.setVisible(b3);
        text.button4.setEnabled(b4);
        text.button4.setVisible(b4);
        text.button5.setEnabled(b5);
        text.button5.setVisible(b5);
        text.label0.setVisible(l0);
        text.label1.setVisible(l1);
        text.label2.setVisible(l2);
        text.text0.setEnabled(t0);
        text.text0.setVisible(t0);
    }

    /**
    * Method for setting the String output 
    *
    * Date created: 11/7/2020
    * 
    * @author Maxwell Brown
    * 
    */
    public static void textAll(String b0, String b1, String b2, String b3, String b4, String b5,
                                String t0, String l0, String l1, String l2)
    {
        text.button0.setText(b0);
        text.button1.setText(b1);
        text.button2.setText(b2);
        text.button3.setText(b3);
        text.button4.setText(b4);
        text.button5.setText(b5);
        text.label0.setText(l0);
        text.label1.setText(l1);
        text.label2.setText(l2);
    }

    /**
    * Setter for the location of all buttons 
    * for user input 
    *
    * Date created: 11/7/2020
    * 
    * @author Maxwell Brown
    * 
    */
    public static void locationButton(int b0w, int b0l, int b0x, int b0y,
                                      int b1w, int b1l, int b1x, int b1y,
                                      int b2w, int b2l, int b2x, int b2y,
                                      int b3w, int b3l, int b3x, int b3y,
                                      int b4w, int b4l, int b4x, int b4y,
                                      int b5w, int b5l, int b5x, int b5y)
    {
        Insets insets = text.pane.getInsets();
        text.button0.setBounds(b0x + insets.left, b0y + insets.top, b0w, b0l);
        text.button1.setBounds(b1x + insets.left, b1y + insets.top, b1w, b1l);
        text.button2.setBounds(b2x + insets.left, b2y + insets.top, b2w, b2l);
        text.button3.setBounds(b3x + insets.left, b3y + insets.top, b3w, b3l);
        text.button4.setBounds(b4x + insets.left, b4y + insets.top, b4w, b4l);
        text.button5.setBounds(b5x + insets.left, b5y + insets.top, b5w, b5l);
        
    }

    /**
    * Setters for locations of fields
    *
    * Date created: 11/7/2020
    * 
    * @author Maxwell Brown
    * 
    */
    public static void locationField(int l0w, int l0l, int l0x, int l0y,
                                     int l1w, int l1l, int l1x, int l1y,
                                     int l2w, int l2l, int l2x, int l2y,
                                     int t0w, int t0l, int t0x, int t0y)
    {
        Insets insets = text.pane.getInsets();
        text.label0.setBounds(l0x + insets.left, l0y + insets.top, l0w, l0l);
        text.label1.setBounds(l1x + insets.left, l1y + insets.top, l1w, l1l);
        text.label2.setBounds(l2x + insets.left, l2y + insets.top, l2w, l2l);
        text.text0.setBounds(t0x + insets.left, t0y + insets.top, t0w, t0l);
    }
}
