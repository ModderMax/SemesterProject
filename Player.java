/**
 * ---------------------------------------------------------------------------
 * File name: Entity.java
 * Project name: Semester Project - Text Based RPG
 * ---------------------------------------------------------------------------
 * Creator's name and email: Daniel Campbell, campbelldb@etdu.edu
 * Creator's name and email: Maxwell Brown, max@nendal.com
 * Course:  CSCI-1250
 * Creation Date: 11/7/2020 
 * Last updated: 11/23/2020
 * ---------------------------------------------------------------------------
*/

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Class for determining the String and integers of statistics 
 * surrounding the users player character, determining
 * both input and output
 *
 * Date created: 11/7/2020
 * 
 * @author Daniel Campbell
 * @author Maxwell Brown
 */
public class Player 
{
    ArrayList<Item> inventory;
    String username;
    int playerMaxHealth;
    int playerHealth;
    int experience;
    int playerStrength;
    int playerDexterity;
    int playerAccuracy;
    int playerArmor;
    int playerLevel;

    /**
    * Constructor that determines the user's starting statistics as well 
    * as the name input they give at the start of the program
    *
    * Date created: 11/7/2020
    * 
    * @author Daniel Campbell
    * @author Maxwell Brown
    */
    Player(String username) {
        this.username = username;
        experience = 0;
        playerMaxHealth = 15;
        playerHealth = 15;
        playerStrength = 0;
        playerDexterity = 0;
        playerAccuracy = 0;
        playerArmor = 0;
        playerLevel = 0;
    }
    
    /**
    * Method that determines when the user's character
    * meets the conditions to level up 
    *
    * Date created: 11/7/2020
    * 
    * @author Daniel Campbell
    * @author Maxwell Brown
    */
    public void checkLevelup() {
        switch (playerLevel) {
            case 0:
                if (experience > 15) 
                {
                    levelUp();
                    experience = experience - 15;
                }
            break;
            case 1:
                if (experience > 20) 
                {
                    levelUp();
                    experience = experience - 20;
                }
            break;
            case 2:
                if (experience > 45) 
                {
                    levelUp();
                    experience = experience - 50;
                }
            break;
            case 3:
                if (experience > 80) 
                {
                    levelUp();
                    experience = experience - 110;
                }
            break;
            case 4:
                if (experience > 125) 
                {
                    levelUp();
                    experience = experience - 110;
                }
            break;
        }
    }

    /**
    * Method that accepts user input as to which
    * stats to increase during a level up process
    *
    * Date created: 11/8/2020
    * 
    * @author Daniel Campbell
    * @author Maxwell Brown
    */
    public void levelUp() {
        playerLevel ++;
        Object[] options = { "Health", "Strength", "Dexterity", "Accuracy", "Armor" };
        int answer = JOptionPane.showOptionDialog(null, "What proficiency do you want to improve?", "You have Leveled Up!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, options[0]);

        switch (answer) {
            case 0:
                playerMaxHealth = playerMaxHealth + 5;
                playerHealth = playerMaxHealth;
                break;
            case 1:
                playerStrength ++;
                playerHealth = playerMaxHealth;
                break;
            case 2:
                playerDexterity ++;
                playerHealth = playerMaxHealth;
                break;
            case 3:
                playerAccuracy ++;
                playerHealth = playerMaxHealth;
                break;
            case 4:
                playerArmor ++;
                playerHealth = playerMaxHealth;
                break;
            default:
                System.out.println("Input Error: Selection not recieved");
                System.exit(0);
        }
    }

    /**
    * Method that checks if the conditions are met for
    * the user's death
    *
    * Date created: 11/8/2020
    * 
    * @author Daniel Campbell
    * @author Maxwell Brown
    */
    public void checkDeath() 
    {
        if (playerHealth <= 0) 
        {
            death();
        }
    }

    /**
    * Method that activates the death sequence
    * once called
    *
    * Date created: 11/8/2020
    * 
    * @author Daniel Campbell
    * @author Maxwell Brown
    */
    public void death() 
    {
        Encounter.death();
    }

    /**
    * Method that determines how much player health
    * is affected by certain actions
    *
    * Date created: 11/8/2020
    * 
    * @author Daniel Campbell
    * @author Maxwell Brown
    */
    public void affectPlayerHealth(int amount) 
    {
        playerHealth = playerHealth - amount;
        if(playerHealth > playerMaxHealth)
        {
            playerHealth = playerMaxHealth;
        }
    }

    /**
    * Method that returns the player's current health
    * as String output
    *
    * Date created: 11/8/2020
    * 
    * @author Daniel Campbell
    * @author Maxwell Brown
    */
    public String getHealthString()
    {
        int num = playerHealth;
        String out = "";
        do
        {
            out += "❤ ";
            num --;
        }while(num > 0);
        out += " (" + text.player.getPlayerHealth() + ")";
        if(playerHealth > 0)
        {
            return out;
        }
        else
        {
            return "dead";
        }
    }

    // Setter for the player's username
    public void setUsername(String username) 
    {
        this.username = username;
    }

    // Getter that returns player's username
    public String getUsername() 
    {
        return username;
    }

    // Getter that returns player's accuracy
    public int getPlayerAccuracy() 
    {
        return playerAccuracy;
    }
    
    // Getter that returns player's dexterity
    public int getPlayerDexterity() 
    {
        return playerDexterity;
    }

    // Getter that returns player's current health
    public int getPlayerHealth() 
    {
        return playerHealth;
    }

    // Getter that returns player's current XP
    public int getExperience() 
    {
        return experience;
    }

    // Getter that returns player's current level
    public int getPlayerLevel()
    {
        return playerLevel;
    }

    // Getter that returns player's armor
    public int getPlayerArmor() 
    {
        return playerArmor;
    }

    // Getter that returns player's max health
    public int getPlayerMaxHealth() 
    {
        return playerMaxHealth;
    }

    // Getter that returns player's strength
    public int getPlayerStrength() 
    {
        return playerStrength;
    }

    // Setter for the user's max health
    public void setPlayerMaxHealth(int playerMaxHealth) 
    {
        this.playerMaxHealth = playerMaxHealth;
    }

    // Setter for the user's current experience
    public void setExperience(int experience) 
    {
        this.experience = experience;
    }

    // Setter for the user's current armor
    public void setPlayerArmor(int playerArmor) 
    {
        this.playerArmor = playerArmor;
    }

    // Setter for the user's strength
    public void setPlayerStrength(int playerStrength) 
    {
        this.playerStrength = playerStrength;
    }

    // Setter for the user's dexterity
    public void setPlayerDexterity(int playerDexterity) 
    {
        this.playerDexterity = playerDexterity;
    }

    // Setter for the user's health
    public void setPlayerHealth(int playerHealth) 
    {
        this.playerHealth = playerHealth;
    }
}
