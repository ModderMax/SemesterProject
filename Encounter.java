public class Encounter 
{
    public static void tutorial()
    {
        Entity.slime();
        ChangeUI.enableAll(true, true, true, true, false, false, false, true, true, true);
        ChangeUI.locationButton(120, 30, 120, 520,
                                120, 30, 280, 520, 
                                120, 30, 120, 600, 
                                120, 30, 280, 600, 
                                text.button4.getPreferredSize().width, text.button4.getPreferredSize().height, 100, 10, 
                                text.button5.getPreferredSize().width, text.button5.getPreferredSize().height, 100, 10);
        ChangeUI.locationField(500, text.label0.getPreferredSize().height, 0, 0,
                               500, text.label1.getPreferredSize().height, 235, 470,
                               400, text.label2.getPreferredSize().height + 400, 40, 50,
                               text.text0.getPreferredSize().width, text.text0.getPreferredSize().height, 190, 420);
        ChangeUI.textAll("Attack", "Defend", "Inventory", "Run", "Exit", "Soul", "Y",
                            text.player.getUsername() + ": " + text.player.getHealthString(),
                            text.entity.getEntityName() + ": " + text.entity.getEntityHealth() + "/" + text.entity.getEntityMaxHealth(), Config.slimeTexture());
    }

    public static void sansEncounter()
    {
        ChangeUI.enableAll(false, true, false, true, false, false, true, true, false, false);
        ChangeUI.locationButton(text.button0.getPreferredSize().width, text.button0.getPreferredSize().height, 0, 0,
                                100, 20, 5, 5, 
                                text.button2.getPreferredSize().width, text.button2.getPreferredSize().height, 200, 600, 
                                text.button3.getPreferredSize().width, text.button3.getPreferredSize().height, 180, 460, 
                                text.button4.getPreferredSize().width, text.button4.getPreferredSize().height, 0, 0, 
                                text.button5.getPreferredSize().width, text.button5.getPreferredSize().height, 0, 0);
        ChangeUI.locationField(240, 100, 195, 360, 
                               text.label1.getPreferredSize().width, text.label1.getPreferredSize().height, 0, 0, 
                               text.label2.getPreferredSize().width, text.label2.getPreferredSize().height, 0, 0,
                               text.text0.getPreferredSize().width, text.text0.getPreferredSize().height, 190, 420);
        ChangeUI.textAll("Attack", "Defend", "Inventory", "Run", "Exit", "Soul", "Y",
                          text.player.getUsername() + ": " + text.player.getHealthString(),
                          text.entity.getEntityName() + ": " + text.entity.getEntityHealth() + "/" + text.entity.getEntityMaxHealth(), Config.slimeTexture());
    }
}
