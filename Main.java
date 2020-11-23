/**
 * ---------------------------------------------------------------------------
 * File name: Main.java
 * Project name: Semester Project - Text Based RPG
 * ---------------------------------------------------------------------------
 * Creator's name and email: Maxwell Brown, max@nendal.com
 * Course:  CSCI 1250
 * Creation Date: 11/7/2020 
 * ---------------------------------------------------------------------------
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 * text class for identifying the active listener
 * contains the main method to run the program
 *
 * Date created: 11/7/2020
 * 
 * @author Maxwell Brown
 * @author
 */

class text extends JFrame implements ActionListener 
{
    private static final long serialVersionUID = -2421597325560762362L;
  
    static Player player;
    static JButton button0 = new JButton();
    static JButton button1 = new JButton("Exit");
    static JButton button2 = new JButton("Start Game!");
    static JButton button3 = new JButton("Select Username");
    static JButton button4 = new JButton();
    static JButton button5 = new JButton();
    static JLabel label0 = new JLabel("Enter a UserName");
    static JLabel label1 = new JLabel(" ");
    static JLabel label2 = new JLabel(" ");
    static JTextField text0 = new JTextField(10);
    static text type0 = new text();
    static JPanel pane =  new JPanel();
    static Entity entity = new Entity("", 0, 0, 0, 0, 0, 0);
    static ArrayList<Item> inventory = new ArrayList(6);
    static ArrayList<Item> collection = new ArrayList(6);
    

    /**
     * Main method
     * 
     * Date created: 10/24/2020
     * 
     * @author Maxwell Brown
     */
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++)
        {
            Item.punch();
        }
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                menu();
            }
        });
    }

    /**
     * constructor for making an active listener
     * 
     * Date created: 10/24/2020
     * 
     * @author Maxwell Brown
     */
    text() 
    {

    }

    /**
     * Method for setting up the JFrame
     * 
     * Date created: 10/24/2020
     * 
     * @author Maxwell Brown
     */
    public static void menu() {
        // Create and set up the window.
        JFrame frame = new JFrame("Super Cool Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        // Size and display the window.
        Insets insets = frame.getInsets();
        frame.setSize(Config.getxResolution() + insets.left + insets.right, Config.getyResolution() + insets.top + insets.bottom);
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);
    }

    /**
     * Method for setting up the JPanel
     * 
     * Date created: 10/24/2020
     * 
     * @author Maxwell Brown
     */
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(null);

        // adds action listeners to each button
        button0.addActionListener(type0);
        button1.addActionListener(type0);
        button2.addActionListener(type0);
        button3.addActionListener(type0);
        button4.addActionListener(type0);
        button5.addActionListener(type0);

        // adds components to the panel
        pane.add(label0);
        pane.add(label1);
        pane.add(label2);
        pane.add(text0);
        pane.add(button0);
        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
        pane.add(button4);
        pane.add(button5);

        // sets the position and size of each component
        ChangeUI.locationButton(button0.getPreferredSize().width, button0.getPreferredSize().height, 0, 0,
                                100, 20, 5, 5, 
                                button2.getPreferredSize().width, button2.getPreferredSize().height, 200, 600, 
                                button3.getPreferredSize().width, button3.getPreferredSize().height, 180, 460, 
                                button4.getPreferredSize().width, button4.getPreferredSize().height, 0, 0, 
                                button5.getPreferredSize().width, button5.getPreferredSize().height, 0, 0);
        ChangeUI.locationField(240, 100, 195, 360, 
                               label1.getPreferredSize().width, label1.getPreferredSize().height, 0, 0, 
                               label2.getPreferredSize().width, label2.getPreferredSize().height, 0, 0,
                               text0.getPreferredSize().width, text0.getPreferredSize().height, 190, 420);
        ChangeUI.enableAll(false, true, false, true, false, false, true, true, false, false);
    }

    /**
     * Method for taking input from the active listener
     * 
     * Date created: 10/24/2020
     * 
     * @author Maxwell Brown
     */
    public void actionPerformed(ActionEvent type0) 
    {
        String s = type0.getActionCommand();
        if (s.equals("Select Username")) 
        {
            String input = text0.getText(); // gets the input from the field and puts it in a variable
            input += "              L"; // adds spaces to the string to avoid error in taking the substring and set the username to 'L' if nothing is entered
            input = input.substring(0, 15); // takes only the first 16 characters to avoid super long names
            input = input.trim(); // trims any extra spaces
            player = new Player(input); // makes a new player with the inputted username
            label0.setText(player.getUsername() + " is your current username"); // lets the player know what their username will be
            text0.setText(""); // set the text of the input field to blank
            ChangeUI.enableAll(false, true, true, true, false, false, true, true, false, false);
        } 
        else if (s.equals("Exit")) 
        {
            System.exit(0); // exits the program
        } 
        else if (s.equals("Start Game!")) 
        {
            Event.introduction0(); // starts the game
        }
        else if (s.equals("Ok"))
        {
            Event.confirmOp();
        }
        else if (s.equals("No"))
        {
            Event.rejectOp();
        }
        else if(s.equals("Attack"))
        {
            Event.attackInventory();
        }
        else if(s.equals("Information"))
        {
            Event.information();
        }
    }

    public static Object[] getItemArray() 
    {
        String slot0 = inventory.get(0).getName();
        String slot1 = inventory.get(1).getName();
        String slot2 = inventory.get(2).getName();
        String slot3 = inventory.get(3).getName();
        String slot4 = inventory.get(4).getName();
        String slot5 = inventory.get(5).getName();
        Object[] slots = {slot0, slot1, slot2, slot3, slot4, slot5};
        return slots;
    }
}