public class Encounter 
{
    public static void tutorial()
    {
        Entity.greenSlime();
        ChangeUI.enableAll(true, true, true, true, false, false, false, true, true, true);
        ChangeUI.locationButton(120, 30, 120, 520,
                                120, 30, 280, 520, 
                                120, 30, 120, 600, 
                                120, 30, 280, 600, 
                                text.button4.getPreferredSize().width, text.button4.getPreferredSize().height, 100, 10, 
                                text.button5.getPreferredSize().width, text.button5.getPreferredSize().height, 100, 10);
        ChangeUI.locationField(500, text.label0.getPreferredSize().height, 0, 0,
                               500, text.label1.getPreferredSize().height, 220, 470,
                               400, text.label2.getPreferredSize().height + 400, 40, 50,
                               text.text0.getPreferredSize().width, text.text0.getPreferredSize().height, 190, 420);
        ChangeUI.textAll("Attack", "Defend", "Information", "Run", "Exit", "Soul", "Y",
                            text.player.getUsername() + ": " + text.player.getHealthString(),
                            text.entity.getEntityName() + ": " + text.entity.getHealthString(), Config.slimeTexture());
    }

    public static void battle()
    {
        Event.currentEventId = 1;
        ChangeUI.enableAll(true, true, true, true, false, false, false, true, true, true);
        ChangeUI.locationButton(120, 30, 120, 520,
                                120, 30, 280, 520, 
                                120, 30, 120, 600, 
                                120, 30, 280, 600, 
                                text.button4.getPreferredSize().width, text.button4.getPreferredSize().height, 100, 10, 
                                text.button5.getPreferredSize().width, text.button5.getPreferredSize().height, 100, 10);
        ChangeUI.locationField(500, text.label0.getPreferredSize().height, 0, 0,
                               500, text.label1.getPreferredSize().height, 220, 470,
                               400, text.label2.getPreferredSize().height + 200, 40, 50,
                               text.text0.getPreferredSize().width, text.text0.getPreferredSize().height, 190, 420);
        ChangeUI.textAll("Attack", "Defend", "Information", "Run", "Exit", "Soul", "Y",
                            text.player.getUsername() + ": " + text.player.getHealthString(),
                            text.entity.getEntityName() + ": " + text.entity.getHealthString(), Config.slimeTexture());
    }
}
