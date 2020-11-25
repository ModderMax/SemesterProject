public class Encounter 
{
    static String activeTexture;
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
        ChangeUI.textAll("Attack", "Defend", "Information", "Run", "Exit", "Soul", "x",
                            text.player.getUsername() + ": " + text.player.getHealthString(),
                            text.entity.getEntityName() + ": " + text.entity.getHealthString(), Config.slimeTexture());
        Event.currentProgress ++;
    }

    public static void battle()
    {
        text.player.checkLevelup();
        Event.currentEventId = 1;
        ChangeUI.enableAll(true, true, true, true, false, false, false, true, true, true);
        ChangeUI.locationButton(120, 30, 120, 520,
                                120, 30, 280, 520, 
                                120, 30, 120, 600, 
                                120, 30, 280, 600, 
                                text.button4.getPreferredSize().width, text.button4.getPreferredSize().height, 100, 10, 
                                text.button5.getPreferredSize().width, text.button5.getPreferredSize().height, 100, 10);
        ChangeUI.locationField(500, text.label0.getPreferredSize().height, 0, 0,
                               500, text.label1.getPreferredSize().height, 40, 450,
                               400, text.label2.getPreferredSize().height + 200, 40, 0,
                               text.text0.getPreferredSize().width, text.text0.getPreferredSize().height, 190, 420);
        ChangeUI.textAll("Attack", "Defend", "Information", "Run", "Exit", "Soul", "x",
                            text.player.getUsername() + ": " + text.player.getHealthString(),
                            text.entity.getEntityName() + ": " + text.entity.getHealthString(), Encounter.activeTexture);
                            Event.currentProgress ++;
    }

    public static void ed()
    {
        Event.currentEventId = 2;
        ChangeUI.enableAll(true, true, false, false, false, false, false, true, true, true);
        ChangeUI.locationButton(120, 30, 120, 520,
                                120, 30, 280, 520, 
                                120, 30, 120, 600, 
                                120, 30, 280, 600, 
                                text.button4.getPreferredSize().width, text.button4.getPreferredSize().height, 100, 10, 
                                text.button5.getPreferredSize().width, text.button5.getPreferredSize().height, 100, 10);
        ChangeUI.locationField(500, text.label0.getPreferredSize().height, 40, 20,
                               500, text.label1.getPreferredSize().height + 60, 40, 410,
                               400, text.label2.getPreferredSize().height + 200, 40, -40,
                               text.text0.getPreferredSize().width, text.text0.getPreferredSize().height, 190, 420);
        ChangeUI.textAll("Ok", "No", "x", "x", "x", "x", "x", "Edward Elric",
                            "<html>Hey, you.<br>Do you know about transmutation?<br>It works according to the laws of equivalent exchange.<br>" + 
                            "Here, in exchange for part of your life, I can make you stronger.<br>Do you accept?", Config.charSprite());
                            Event.currentProgress ++;         
    }

    public static void sans()
    {
        
    }

    public static void bossBattle()
    {
        text.player.checkLevelup();
        Event.currentEventId = 3;
        ChangeUI.enableAll(true, true, true, true, false, false, false, true, true, true);
        ChangeUI.locationButton(120, 30, 120, 520,
                                120, 30, 280, 520, 
                                120, 30, 120, 600, 
                                120, 30, 280, 600, 
                                text.button4.getPreferredSize().width, text.button4.getPreferredSize().height, 100, 10, 
                                text.button5.getPreferredSize().width, text.button5.getPreferredSize().height, 100, 10);
        ChangeUI.locationField(500, text.label0.getPreferredSize().height, 0, 0,
                               500, text.label1.getPreferredSize().height, 220, 470,
                               400, text.label2.getPreferredSize().height + 200, 40, -20,
                               text.text0.getPreferredSize().width, text.text0.getPreferredSize().height, 190, 420);
        ChangeUI.textAll("Attack", "Defend", "Information", "𝕹𝕺 𝕰𝕾𝕮𝕬𝕻𝕰", "Why try?", "Soul", "x",
                            text.player.getUsername() + ": " + text.player.getHealthString(),
                            text.entity.getEntityName() + ": " + text.entity.getEntityHealth() + "/" + text.entity.getEntityMaxHealth(), Encounter.activeTexture);
                            Event.currentProgress ++;
    }

    public static void death()
    {
        ChangeUI.enableAll(true, true, false, false, false, false, false, true, true, true);
        ChangeUI.locationButton(120, 30, 120, 520,
                                120, 30, 280, 520, 
                                120, 30, 120, 600, 
                                120, 30, 280, 600, 
                                text.button4.getPreferredSize().width, text.button4.getPreferredSize().height, 100, 10, 
                                text.button5.getPreferredSize().width, text.button5.getPreferredSize().height, 100, 10);
        ChangeUI.locationField(500, text.label0.getPreferredSize().height, 0, 0,
                               500, text.label1.getPreferredSize().height, 40, 450,
                               400, text.label2.getPreferredSize().height + 200, 40, -20,
                               text.text0.getPreferredSize().width, text.text0.getPreferredSize().height, 190, 420);
        ChangeUI.textAll("𝓐𝓬𝓬𝓮𝓹𝓽 𝓓𝓮𝓪𝓽𝓱", "𝕯𝖊𝖓𝖞 𝕱𝖆𝖙𝖊", "Information", "𝕹𝕺 𝕰𝕾𝕮𝕬𝕻𝕰", "Why try?", "Soul", "x",
                            text.player.getUsername() + ": " + text.player.getHealthString(),
                            "Your body has died, what will your soul do?", Config.graveTexture());
    }
}
