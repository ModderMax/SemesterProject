public class Event
{
    private static int currentEventId; // for keeping track of what event is active for the sake of confirm and reject working properly.

    public static void introduction() {
        Event.currentEventId = 0;
        text.button1.disable();
        text.button1.setVisible(false);
        text.button3.disable();
        text.button3.setVisible(false);
        text.text0.disable();
        text.text0.setVisible(false);
        text.label0.setText("Welcome to the dungeon.");
        text.button2.setText("Ok");
    }

    public static void confirmOp()
    {
        System.out.println("yeet");
    }

    public static void rejectOp()
    {
        System.out.println("yoink");
    }
}
