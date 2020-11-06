import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class text extends JFrame implements ActionListener
{
    private static final long serialVersionUID = -2421597325560762362L;
    static JButton button0 = new JButton("Settings");
    static JButton button1 = new JButton("Exit");
    static JButton button2 = new JButton("Start Game!");
    static JButton button3 = new JButton("Select Username");
    static JLabel label0 = new JLabel("Enter a UserName");
    static JTextField text0 = new JTextField(10);
    static text type0 = new text();
    public static void main(String[] args) 
    {

        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                menu();
            }
        });
    } 

    text()
    {

    }
    
    public static void menu() 
    {  
        //Create and set up the window.
        JFrame frame = new JFrame("Super Cool Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
 
        //Size and display the window.
        Insets insets = frame.getInsets();
        frame.setSize(500 + insets.left + insets.right,
                      700 + insets.top + insets.bottom);
        frame.setVisible(true);
    }  
    
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(null);

        button0.addActionListener(type0);
        button1.addActionListener(type0);
        button2.addActionListener(type0);
        button3.addActionListener(type0);

        pane.add(label0);
        pane.add(text0);
        pane.add(button0);
        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
 
        Insets insets = pane.getInsets();
        Dimension size = button0.getPreferredSize();
        button0.setBounds(380 + insets.left, 5 + insets.top,
                     100, 20);
        size = button1.getPreferredSize();
        button1.setBounds(5 + insets.left, 5 + insets.top,
                     100, 20);
        size = button2.getPreferredSize();
        button2.setBounds(200, 600 + insets.top,
                     size.width, size.height);
        size = button3.getPreferredSize();
        button3.setBounds(180, 460 + insets.top,
                     size.width, size.height);
        size = text0.getPreferredSize();
        text0.setBounds(190, 420 + insets.top,
                     size.width, size.height);
        size = label0.getPreferredSize();
        label0.setBounds(195, 390 + insets.top,
                     size.width + 200, size.height);
    }

    public void actionPerformed(ActionEvent type0) 
    { 
        String s = type0.getActionCommand(); 
        if (s.equals("Select Username")) { 
            // set the text of the label to the text of the field 
            String input = text0.getText();
            input += "                ";
            input = input.substring(0, 15);
            input = input.trim();
            label0.setText(input + " is your current username"); 
            Player.setUsername(input);
            // set the text of field to blank 
            text0.setText(""); 
        } 
        else if(s.equals("Exit"))
        {
            System.exit(0);
        }
    } 

    public static void addItem(String name, int damage, String effect, int effectStrength, int special)
    {

    }    
}