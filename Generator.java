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
            System.out.println("Successfully ran away");
            return true;
        }
        else
        {
            System.out.println("Failed to run away");
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
                System.out.println("You hit the " + text.entity.getEntityName());
                return true;
            }
            else
            {
                System.out.println("You missed the " + text.entity.getEntityName());
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
                System.out.println("The " + text.entity.getEntityName() + " hit you");
                return true;
            }
            else
            {
                System.out.println("The " + text.entity.getEntityName() + " missed you");
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
        int bonus = text.entity.getEntityExp() / 10;
        randomInt = randomInt - bonus;
        if(randomInt <= 8)
        {
            randomLegendary();
        }
        else
        {
            if(randomInt <= 20)
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
        randomEncounter();
        int randomInt = rand.nextInt(5);
        if(randomInt > 0)
        {
            randomBattle();
        }
        else
        {
            randomEncounter();
        }
    }

    public static void randomTrial()
    {

    }

    public static void randomEncounter()
    {
        Encounter.ed();
    }

    public static void randomBattle()
    {
        int randomInt;
        switch(text.player.getPlayerLevel())
        {
            case 0:
                randomInt = rand.nextInt(3);
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
                    case 3:
                        Entity.giantRat();
                    break;
                    case 4:
                        Entity.slightlyLessRat();
                    break;
                    case 5:
                        Entity.phantasm();
                    break;
                }
            break;
            case 1:
            randomInt = rand.nextInt(3);
                switch(randomInt)
                {
                    case 0:
                        Entity.goblinSkirmisher();
                    break;
                    case 1:
                        Entity.goblinAmbusher();
                    break;
                    case 2:
                        Entity.skeletonArcher();
                    break;
                    case 3:
                        Entity.phantom();
                    break;
                    case 4:

                }
            break;
            case 2:
            randomInt = rand.nextInt(3);
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
                    case 3:
                        Entity.skeletonArcher();
                    break;

                }
            break;
            case 3:
            randomInt = rand.nextInt(3);
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
                    case 3:
                        Entity.banshee();
                    break;
                    case 4:
                        Entity.lich();
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
                    case 1:
                        Entity.rougeKnight();
                    break;
                    case 2:
                        Entity.babyDragon();
                    break;
                    case 3:
                        Entity.griffin();
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
        System.out.println("A " + text.entity.getEntityName() + " has appeared");
        Encounter.battle();
    }
}