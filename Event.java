/**
 * Event class for handling events that take place outside of fights and trials.
 *
 * Date created: 11/7/2020
 * 
 * @author Maxwell Brown
 */
public class Event
{
    private static int currentEventId; // for keeping track of what event is active for the sake of confirm and reject working properly.


    public static void confirmOp()
    {
        switch(Event.currentEventId)
        {
            case 0:
            introduction1();
            break;
        }

    }

    /**
     * Method for taking a negative affirmation from the player
     * 
     * Date created: 10/24/2020
     * 
     */
    public static void rejectOp()
    {
        System.out.println("yoink");
    }
    
    public static void introduction0() {
        Event.currentEventId = 0;
        text.button1.setEnabled(false);
        text.button1.setVisible(false);
        text.button3.setEnabled(false);
        text.button3.setVisible(false);
        text.text0.setEnabled(false);
        text.text0.setVisible(false);
        text.label0.setText("Welcome to the dungeon.");
        text.button2.setText("Ok");
    }

    public static void introduction1()
    {
        Encounter.tutorial();
    }

    public static void inventory()
    {
        
    }

}
