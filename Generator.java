import java.util.Random;

public class Generator 
{
    static Random rand = new Random();
    public static Item held;

    public static boolean doesRun()
    {
        int randomInt = rand.nextInt(7);
        int x = text.player.getPlayerDexterity() - text.player.getPlayerDexterity();
        x = x + 4;
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
        int randomInt = rand.nextInt(105);
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
        int randomInt = rand.nextInt(3);

        switch(randomInt)
        {
            case 0:
            Item.theComicallyLargeSpoon();
            break;
            case 1:
            Item.actOfViolence();
            break;
            case 2:
            Item.bradleysStraightSaberOfWrath();
            break;
        }
    }

    public static void randomUnique()
    {
        int randomInt = rand.nextInt(4);

        switch(randomInt)
        {
            case 0:
            Item.energySword();
            break;
            case 1:
            Item.threeDimensionalManeuverGear();
            break;
            case 2:
            Item.masterSword();
            break;
            case 3:
            Item.diamondSword();
            break;
        }
    }

    public static void randomRare()
    {
        int randomInt = rand.nextInt(2);

        switch(randomInt)
        {
            case 0:
            Item.charasKnife();
            break;
            case 1:
            Item.hashSlingingSlashSingingSpatula();
            break;
        }
    }

    public static void randomCommon()
    {
        int randomInt = rand.nextInt(2);

        switch(randomInt)
        {
            case 0:
            Item.slipper();
            break;
            case 1:
            Item.fryingPan();
            break;
        }
    }

    public static void randomEvent()
    {
        Event.currentProgress ++;
        randomBattle();
        /*int randomInt = rand.nextInt(5);
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
        } */
    }

    public static void randomTrial()
    {

    }

    public static void randomEncounter()
    {

    }

    public static void randomBattle()
    {
        int randomInt;
        switch(text.player.getPlayerLevel())
        {
            case 0:
                randomInt = rand.nextInt(1);
                switch(randomInt)
                {
                    case 0:
                        Entity.blueSlime();
                    break;
                    case 1:
                        Entity.greenSlime();
                    break;
                    case 2:
                        Entity.wolf();
                    break;
                }
            break;
            case 1:
            randomInt = rand.nextInt(1);
                switch(randomInt)
                {
                    case 0:
                        Entity.goblinSkirmisher();
                    break;
                    case 1:
                        Entity.goblinAmbusher();
                    break;
                    case 2:
                        Entity.skeleton();
                    break;
                }
            break;
            case 2:
            randomInt = rand.nextInt(1);
                switch(randomInt)
                {
                    case 0:
                        Entity.goblinChef();
                    break;
                    case 1:
                        Entity.skeletonSoldier();
                    break;
                    case 2:
                        Entity.direWolf();
                    break;
                }
            break;
            case 3:
            randomInt = rand.nextInt(1);
                switch(randomInt)
                {
                    case 0:
                        Entity.capraDemon();
                    break;
                    case 1:
                        Entity.battleCube();
                    break;
                    case 2:
                        Entity.haywireDroid();
                    break;
                }
            break;
            case 4:
            randomInt = rand.nextInt(1);
                switch(randomInt)
                {
                    case 0:
                        Entity.wraith();
                    break;
                }
            break;
            case 5:
            randomInt = rand.nextInt(1);
                switch(randomInt)
                {
                    case 0:
                        Entity.wraith();
                    break;
                }
            break;
        }
        Encounter.battle();
    }
}