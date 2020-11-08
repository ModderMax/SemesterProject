public class Encounter 
{
    public static void tutorial()
    {
        ChangeUI.enableAll(true, true, true, true, false, false, false, true, true, true);
        ChangeUI.locationButton(120, 30, 120, 420,
                                120, 30, 280, 420, 
                                120, 30, 120, 500, 
                                120, 30, 280, 500, 
                                text.button4.getPreferredSize().width, text.button4.getPreferredSize().height, 100, 10, 
                                text.button5.getPreferredSize().width, text.button5.getPreferredSize().height, 100, 10);
        ChangeUI.locationField(500, text.label0.getPreferredSize().height, 0, 0,
                               text.label1.getPreferredSize().width, text.label1.getPreferredSize().height, 0, 0, 
                               text.label2.getPreferredSize().width, text.label2.getPreferredSize().height, 0, 0,
                               text.text0.getPreferredSize().width, text.text0.getPreferredSize().height, 190, 420);
        ChangeUI.textAll("Attack", "Defend", "Inventory", "Run", "Exit", "Soul", "", text.player.getUsername() + ": " + text.player.getHealthString(), "", "");
    }
}
