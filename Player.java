import javax.swing.JOptionPane;

public class Player 
{
    static String username;
    int playerMaxHealth;
    int playerHealth;
    int experience;
    int playerStrength;
    int playerDexterity;
    int playerAccuracy;
    int playerLevel;
    
    Player(String username)
    {
        Player.username = username;
        experience = 0;
        playerMaxHealth = 15;
        playerHealth = 15;
        playerStrength = 1;
        playerDexterity = 1;
        playerAccuracy = 1;
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

    public static void setUsername(String username) 
    {
        Player.username = username;
    }
}
