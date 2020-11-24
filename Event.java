import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * Event class for handling events that take place outside of fights and trials.
 *
 * Date created: 11/7/2020
 * 
 * @author Maxwell Brown
 */
public class Event
{
    static int currentEventId; // for keeping track of what event is active for the sake of confirm and reject working properly.
    static int currentProgress; // for keeping track of when the final boss event should be called


    public static void startEncounter()
    {      
        if(currentEventId == 0)
        {
            JOptionPane.showMessageDialog(null, "You have completed the tutorial.", "Tutorial", JOptionPane.DEFAULT_OPTION);
            Generator.randomEvent();
        }
        else if(currentProgress < 15)
        {
            Generator.randomEvent();
        }
    }
    
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
        switch(Event.currentEventId)
        {
            case 1:
            break;
        }
    }

    public static void pickUp()
    {
        Object[] options = text.getItemArray();
        int answer = JOptionPane.showOptionDialog(null, "What slot do you want to replace?", "Inventory", JOptionPane.DEFAULT_OPTION,
                JOptionPane.DEFAULT_OPTION, null, options, options[0]);
        switch(answer)
        {
            case 0:
            text.inventory.set(answer, Generator.held);
            startEncounter();
            break;
            case 1:
            text.inventory.set(answer, Generator.held);
            startEncounter();
            break;
            case 2:
            text.inventory.set(answer, Generator.held);
            startEncounter();
            break;
            case 3:
            text.inventory.set(answer, Generator.held);
            startEncounter();
            break;
            case 4:
            text.inventory.set(answer, Generator.held);
            startEncounter();
            break;
            case 5:
            text.inventory.set(answer, Generator.held);
            startEncounter();
            break;
        }        
    }

    public static void discard()
    {

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

    public static void attackInventory()
    {
        Object[] options = text.getItemArray();
        int answer = JOptionPane.showOptionDialog(null, "Select which weapon to attack with", "Attack", JOptionPane.DEFAULT_OPTION,
                JOptionPane.DEFAULT_OPTION, null, options, options[0]);
        switch(answer)
        {
            case 0:
            if(Generator.doesHit(text.inventory.get(0).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(0).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                if(text.entity.getEntityArmor() < 0)
                {
                    damage = damage + text.entity.getEntityArmor();
                }
                damage = text.inventory.get(0).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                if(text.entity.isAlive())
                {
                    text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getHealthString());
                    Entity.attack();
                }
                else
                {
                    Entity.kill();
                }
            }
            break;
            case 1:
            if(Generator.doesHit(text.inventory.get(1).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(1).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                if(text.entity.getEntityArmor() < 0)
                {
                    damage = damage + text.entity.getEntityArmor();
                }
                damage = text.inventory.get(1).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                if(text.entity.isAlive())
                {
                    text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getHealthString());
                    Entity.attack();
                }
                else
                {
                    Entity.kill();
                }
            }
            break; 
            case 2:
            if(Generator.doesHit(text.inventory.get(2).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(2).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                if(text.entity.getEntityArmor() < 0)
                {
                    damage = damage + text.entity.getEntityArmor();
                }
                damage = text.inventory.get(2).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                if(text.entity.isAlive())
                {
                    text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getHealthString());
                    Entity.attack();
                }
                else
                {
                    Entity.kill();
                }
            }
            break;
            case 3:
            if(Generator.doesHit(text.inventory.get(3).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(3).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                if(text.entity.getEntityArmor() < 0)
                {
                    damage = damage + text.entity.getEntityArmor();
                }
                damage = text.inventory.get(3).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                if(text.entity.isAlive())
                {
                    text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getHealthString());
                    Entity.attack();
                }
                else
                {
                    Entity.kill();
                }
            }
            break; 
            case 4:
            if(Generator.doesHit(text.inventory.get(4).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(4).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                if(text.entity.getEntityArmor() < 0)
                {
                    damage = damage + text.entity.getEntityArmor();
                }
                damage = text.inventory.get(4).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                if(text.entity.isAlive())
                {
                    text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getHealthString());
                    Entity.attack();
                }
                else
                {
                    Entity.kill();
                }
            }
            break; 
            case 5:
            if(Generator.doesHit(text.inventory.get(5).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(5).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                if(text.entity.getEntityArmor() < 0)
                {
                    damage = damage + text.entity.getEntityArmor();
                }
                damage = text.inventory.get(5).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                if(text.entity.isAlive())
                {
                    text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getHealthString());
                    Entity.attack();
                }
                else
                {
                    Entity.kill();
                }
            }
            break;
        }
        if(text.entity.isAlive() == true)
        {
            Entity.attack();
        }
    }

    public static void information()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        double x = text.player.getPlayerAccuracy() - text.entity.getEntityDexterity();
        double y = text.entity.getEntityAccuracy() - text.player.getPlayerDexterity();
        double chance = x + 6;
        double chances = y + 6;
        chance = chance / 11;
        chances = chances / 11;
        chance = chance * 100;
        chances = chances * 100;
        String out = df.format(chance);
        String prnt = df.format(chances);
        JOptionPane.showMessageDialog(null, "Entity: " + text.entity.getEntityName() +
                                         "\nHealth: " + text.entity.getEntityHealth() + "/" + text.entity.getEntityMaxHealth() + 
                                         "\nAccuracy: " + text.entity.getEntityAccuracy() + 
                                         "\nAttack: " + text.entity.getEntityStrength() + 
                                         "\nArmor: " + text.entity.getEntityArmor() + 
                                         "\nDexterity: " + text.entity.getEntityDexterity() +
                                         "\nChance to hit: " + out + "%" +
                                         "\nChance to get hit: " + prnt + "%",
                                         "Information", JOptionPane.DEFAULT_OPTION);
    }


}
