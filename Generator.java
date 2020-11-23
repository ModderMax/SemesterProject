import java.util.Random;

public class Generator 
{
    static Random rand = new Random();
    public static Item held;

    public static boolean doesRun()
    {
        int randomInt = rand.nextInt(7);
        int x = text.player.getPlayerDexterity() - text.player.getPlayerDexterity();
        x = x + 5;
        if(x > randomInt)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean doesHit(int itemToHit, boolean isPlayer)
    {
        if(isPlayer)
        {
            int x = text.player.getPlayerAccuracy() - text.entity.getEntityDexterity();
            int randomInt = rand.nextInt(11);
            int y = 6 + x + itemToHit;
            if(y > randomInt)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            int x = text.entity.getEntityAccuracy() - text.player.getPlayerDexterity();
            int randomInt = rand.nextInt(11);
            int y = 6 + x;
            if(y > randomInt)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public static int randomBetween(int num1, int num2)
    {
        int disparity = num2 - num1 + 1;
        return rand.nextInt(disparity) + num1;
    }

    public static void randomRarity()
    {
        int randomInt = rand.nextInt(100);
        if(randomInt <= 9)
        {
            randomLegendary();
        }
        else
        {
            if(randomInt <= 25)
            {
                randomUnique();
            }
            else
            {
                if(randomInt <= 55)
                {
                    randomRare();
                }
                else
                {
                    randomCommon();
                }
            }
        }
    }
    
    public static void randomLegendary() 
    {
        int randomInt = rand.nextInt(1);

        switch(randomInt)
        {
            case 0:
            Item.theComicallyLargeSpoon();
            break;
        }
    }

    public static void randomUnique()
    {
        int randomInt = rand.nextInt(1);

        switch(randomInt)
        {
            case 0:
            Item.energySword();
            break;
        }
    }

    public static void randomRare()
    {
        int randomInt = rand.nextInt(1);

        switch(randomInt)
        {
            case 0:
            Item.charasKnife();
            break;
        }
    }

    public static void randomCommon()
    {
        int randomInt = rand.nextInt(1);

        switch(randomInt)
        {
            case 0:
            Item.slipper();
            break;
        }
    }

    public static void randomEvent()
    {
        int randomInt = rand.nextInt(5);
        if(randomInt == 0)
        {
            randomTrial();
        }
        if(randomInt == 1 || randomInt == 2)
        {
            randomEncounter();
        }
        if(randomInt > 2)
        {
            randomBattle();
        }
    }

    public static void randomTrial()
    {

    }

    public static void randomEncounter()
    {

    }

    public static void randomBattle()
    {

    }
}
