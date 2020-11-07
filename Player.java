import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Player 
{
    static ArrayList<Item> inventory;
    static String username;
    static int playerMaxHealth;
    static int playerHealth;
    static int experience;
    static int playerStrength;
    static int playerDexterity;
    static int playerAccuracy;
    static int playerArmor;
    static int playerLevel;
    
    Player(String username)
    {
        Player.username = username;
        experience = 0;
        playerMaxHealth = 15;
        playerHealth = 15;
        playerStrength = 0;
        playerDexterity = 0;
        playerAccuracy = 0;
        playerArmor = 0;
        playerLevel = 0;
    }

    public void checkLevelup()
    {
        switch(playerLevel)
        {
            case 1:
            if(experience > 100)
            {
                levelUp();
            }
        }
    }

    public void levelUp()
    {
        playerLevel ++;
        Object[] options = { "Health", "Strength", "Dexterity", "Accuracy"};
        int answer = JOptionPane.showOptionDialog(null, "What proficiency do you want to improve?", "Stat Increase", JOptionPane.DEFAULT_OPTION,
        JOptionPane.DEFAULT_OPTION, null, options, options[0]);

        switch (answer) 
        {
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
            default :
            System.out.println("Input Error: Selection not recieved");
            System.exit(0);
        }
    }

    public void checkDeath()
    {
        if(playerHealth >= 0)
        {
            death();
        }
    }

    public void death()
    {
        
    }

    public String getHealthString()
    {
        int num = Player.playerHealth;
        String out = "";
        do
        {
            out += "❤ ";
            num --;
        }while(num > 0);
        return out;
    }

    public void setUsername(String username) 
    {
        Player.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
}
