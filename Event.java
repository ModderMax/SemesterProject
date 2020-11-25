/**
 * ---------------------------------------------------------------------------
 * File name: Main.java
 * Project name: Semester Project - Text Based RPG
 * ---------------------------------------------------------------------------
 * Creator's name and email: 
 * Course:  CSCI 1250
 * Creation Date: 11/7/2020 
 * ---------------------------------------------------------------------------
*/

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
        else if(currentEventId == 3)
        {
            JOptionPane.showMessageDialog(null, "You Win! \nYour soul has found true peace.", "You Win", JOptionPane.DEFAULT_OPTION);
            System.exit(0);
        }
        else if(currentProgress < 20)
        {
            Generator.randomEvent();
        }
        else
        {
            Generator.randomBoss();
        }
    }
    
    public static void confirmOp()
    {
        switch(Event.currentEventId)
        {
            case 0:
                introduction1();
            break;
            case 2:
                text.player.setPlayerMaxHealth(text.player.getPlayerMaxHealth() / 2);
                text.player.setPlayerHealth(text.player.getPlayerHealth() / 2 + 1);
                text.player.setPlayerArmor(text.player.getPlayerArmor() + 1);
                text.player.setPlayerStrength(text.player.getPlayerStrength() + 2);
                System.out.println("A part of your soul has been lost in pursuit of strength.");
                startEncounter();
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
            case 2:
                startEncounter();
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
            text.player.checkLevelup();
            startEncounter();
            break;
            case 1:
            text.inventory.set(answer, Generator.held);
            text.player.checkLevelup();
            startEncounter();
            break;
            case 2:
            text.inventory.set(answer, Generator.held);
            text.player.checkLevelup();
            startEncounter();
            break;
            case 3:
            text.inventory.set(answer, Generator.held);
            text.player.checkLevelup();
            startEncounter();
            break;
            case 4:
            text.inventory.set(answer, Generator.held);
            text.player.checkLevelup();
            startEncounter();
            break;
            case 5:
            text.inventory.set(answer, Generator.held);
            text.player.checkLevelup();
            startEncounter();
            break;
        }        
    }

    public static void discard()
    {
        text.player.checkLevelup();
        startEncounter();
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
                }
                else
                {
                    Entity.kill();
                }
                System.out.println("You dealt " + damage + " damage");
                text.inventory.get(0).damageDurability();
                Item.checkAllDurability();
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
                }
                else
                {
                    Entity.kill();
                }
                System.out.println("You dealt " + damage + " damage");
                text.inventory.get(1).damageDurability();
                Item.checkAllDurability();
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
                }
                else
                {
                    Entity.kill();
                }
                System.out.println("You dealt " + damage + " damage");
                text.inventory.get(2).damageDurability();
                Item.checkAllDurability();
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
                }
                else
                {
                    Entity.kill();
                }
                System.out.println("You dealt " + damage + " damage");
                text.inventory.get(3).damageDurability();
                Item.checkAllDurability();
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
                }
                else
                {
                    Entity.kill();
                }
                System.out.println("You dealt " + damage + " damage");
                text.inventory.get(4).damageDurability();
                Item.checkAllDurability();
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
                }
                else
                {
                    Entity.kill();
                }
                System.out.println("You dealt " + damage + " damage");
                text.inventory.get(5).damageDurability();
                Item.checkAllDurability();
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
        Object[] options = {"Enemy", "Player", "Item"};
        int answer = JOptionPane.showOptionDialog(null, "Select what you want information on", "Information Pane", JOptionPane.DEFAULT_OPTION,
                JOptionPane.DEFAULT_OPTION, null, options, options[0]);
        switch(answer)
        {
            case 0:
                Event.informationEnemy();
            break;
            case 1:
                Event.informationPlayer();
            break;
            case 2:
                Event.informationItem();
            break;
        }
    }
    
    public static void informationEnemy()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        double y = text.entity.getEntityAccuracy() - text.player.getPlayerDexterity();
        double chances = y + 6;
        chances = chances / 11;
        chances = chances * 100;
        String prnt = df.format(chances);
        JOptionPane.showMessageDialog(null, "Entity: " + text.entity.getEntityName() +
                                         "\nHealth: " + text.entity.getEntityHealth() + "/" + text.entity.getEntityMaxHealth() + 
                                         "\nAccuracy: " + text.entity.getEntityAccuracy() + 
                                         "\nAttack: " + text.entity.getEntityStrength() + 
                                         "\nArmor: " + text.entity.getEntityArmor() + 
                                         "\nDexterity: " + text.entity.getEntityDexterity() +
                                         "\nChance to get hit: " + prnt + "%",
                                         "Information", JOptionPane.DEFAULT_OPTION);
    }

    public static void informationPlayer()
    {
        JOptionPane.showMessageDialog(null, "Player: " + text.player.getUsername() + 
                                            "\nHealth: " + text.player.getPlayerHealth() + "/" + text.player.getPlayerMaxHealth() +
                                            "\nAccuracy: " + text.player.getPlayerAccuracy() + 
                                            "\nStrength: " + text.player.getPlayerStrength() + 
                                            "\nArmor: " + text.player.getPlayerArmor() + 
                                            "\nDexterity: " + text.player.getPlayerDexterity()
                                            , "Information", JOptionPane.DEFAULT_OPTION);
    }

    public static void informationItem()
    {
        Object[] options = text.getItemArray();
        int answer = JOptionPane.showOptionDialog(null, "Select which weapon to attack with", "Attack", JOptionPane.DEFAULT_OPTION,
                JOptionPane.DEFAULT_OPTION, null, options, options[0]);
        switch(answer)
        {
            case 0:
                JOptionPane.showMessageDialog(null, "Item: " + text.inventory.get(answer).getName() + ", " + text.inventory.get(answer).getRarity() +
                                                    "\nDamage: " + text.inventory.get(answer).getDamage() + 
                                                    "\nAccuracy: " + text.inventory.get(answer).getAccuracy() +
                                                    "\nPierce: " + text.inventory.get(answer).getPiercing() + 
                                                    "\nDurability: " + text.inventory.get(answer).getDurability()
                                               , "Information", JOptionPane.DEFAULT_OPTION);
            break;
            case 1:
                JOptionPane.showMessageDialog(null, "Item: " + text.inventory.get(answer).getName() + ", " + text.inventory.get(answer).getRarity() +
                                                    "\nDamage: " + text.inventory.get(answer).getDamage() + 
                                                    "\nAccuracy: " + text.inventory.get(answer).getAccuracy() +
                                                    "\nPierce: " + text.inventory.get(answer).getPiercing() + 
                                                    "\nDurability: " + text.inventory.get(answer).getDurability()
                                               , "Information", JOptionPane.DEFAULT_OPTION);
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Item: " + text.inventory.get(answer).getName() + ", " + text.inventory.get(answer).getRarity() +
                                                    "\nDamage: " + text.inventory.get(answer).getDamage() + 
                                                    "\nAccuracy: " + text.inventory.get(answer).getAccuracy() +
                                                    "\nPierce: " + text.inventory.get(answer).getPiercing() + 
                                                    "\nDurability: " + text.inventory.get(answer).getDurability()
                                               , "Information", JOptionPane.DEFAULT_OPTION);
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "Item: " + text.inventory.get(answer).getName() + ", " + text.inventory.get(answer).getRarity() +
                                                    "\nDamage: " + text.inventory.get(answer).getDamage() + 
                                                    "\nAccuracy: " + text.inventory.get(answer).getAccuracy() +
                                                    "\nPierce: " + text.inventory.get(answer).getPiercing() + 
                                                    "\nDurability: " + text.inventory.get(answer).getDurability()
                                               , "Information", JOptionPane.DEFAULT_OPTION);
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "Item: " + text.inventory.get(answer).getName() + ", " + text.inventory.get(answer).getRarity() +
                                                    "\nDamage: " + text.inventory.get(answer).getDamage() + 
                                                    "\nAccuracy: " + text.inventory.get(answer).getAccuracy() +
                                                    "\nPierce: " + text.inventory.get(answer).getPiercing() + 
                                                    "\nDurability: " + text.inventory.get(answer).getDurability()
                                               , "Information", JOptionPane.DEFAULT_OPTION);
            break;
            case 5:
                JOptionPane.showMessageDialog(null, "Item: " + text.inventory.get(answer).getName() + ", " + text.inventory.get(answer).getRarity() +
                                                    "\nDamage: " + text.inventory.get(answer).getDamage() + 
                                                    "\nAccuracy: " + text.inventory.get(answer).getAccuracy() +
                                                    "\nPierce: " + text.inventory.get(answer).getPiercing() + 
                                                    "\nDurability: " + text.inventory.get(answer).getDurability()
                                               , "Information", JOptionPane.DEFAULT_OPTION);
            break;
        }
    }

    public static void run()
    {
        if(Generator.doesRun())
        {
            startEncounter();
        }
        else
        {
            Entity.attack();
        }
    }

    public static void defend()
    {
        int x = text.player.getPlayerArmor();
        if(x > 4)
        {
            text.player.setPlayerArmor(x + 3);
        }
        else if(x > 2)
        {
            text.player.setPlayerArmor(x + 2);
        }
        else
        {
            text.player.setPlayerArmor(x + 1);
        }
        Entity.attack();
        text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getHealthString());
        text.player.setPlayerArmor(x);
        if(text.entity.isAlive() == false)
        {       
            Entity.kill();
        }
    }
}