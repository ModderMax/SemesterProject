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

    public void checkDeath() 
    {
        if (playerHealth <= 0) 
        {
            death();
        }
    }

    public void death() 
    {
        Encounter.death();
    }

    public void affectPlayerHealth(int amount) 
    {
        playerHealth = playerHealth - amount;
        if(playerHealth > playerMaxHealth)
        {
            playerHealth = playerMaxHealth;
        }
    }

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

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }

    public int getPlayerAccuracy() 
    {
        return playerAccuracy;
    }
    
    public int getPlayerDexterity() 
    {
        return playerDexterity;
    }

    public int getPlayerHealth() 
    {
        return playerHealth;
    }

    public int getExperience() 
    {
        return experience;
    }

    public int getPlayerLevel()
    {
        return playerLevel;
    }

    public int getPlayerArmor() 
    {
        return playerArmor;
    }

    public int getPlayerMaxHealth() 
    {
        return playerMaxHealth;
    }

    public int getPlayerStrength() 
    {
        return playerStrength;
    }

    public void setPlayerMaxHealth(int playerMaxHealth) 
    {
        this.playerMaxHealth = playerMaxHealth;
    }

    public void setExperience(int experience) 
    {
        this.experience = experience;
    }

    public void setPlayerArmor(int playerArmor) 
    {
        this.playerArmor = playerArmor;
    }

    public void setPlayerStrength(int playerStrength) 
    {
        this.playerStrength = playerStrength;
    }

    public void setPlayerDexterity(int playerDexterity) 
    {
        this.playerDexterity = playerDexterity;
    }

    public void setPlayerHealth(int playerHealth) 
    {
        this.playerHealth = playerHealth;
    }
}
