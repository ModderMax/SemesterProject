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

    public static void randomBoss()
    {
        int randomInt = rand.nextInt(3);
        switch(randomInt)
        {
            case 0:
                Entity.medusa();
                Encounter.activeTexture = Config.medusaTexture();
                Encounter.bossBattle();
            break;
            case 1:
                Entity.hydra();
                Encounter.activeTexture = Config.hyderaTexture();
                Encounter.bossBattle();
            case 2:
                Entity.cerberus();
                Encounter.activeTexture = Config.cerberusTexture();
                Encounter.bossBattle();
            break;
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
        int randomInt = rand.nextInt(3);

        switch(randomInt)
        {
            case 0:
            Item.slipper();
            break;
            case 1:
            Item.fryingPan();
            break;
            case 2: 
            Item.broom();
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

    public static void randomTrial() // Uncompleted; do not implement
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
                        Encounter.activeTexture = Config.slimeTexture();
                    break;
                    case 1:
                        Entity.greenSlime();
                        Encounter.activeTexture = Config.slimeTexture();
                    break;
                    case 2:
                        Entity.wolf();
                        Encounter.activeTexture = Config.wolfTexture();
                    break;
                    case 3:
                        Entity.giantRat();
                        Encounter.activeTexture = Config.mouseTexture();
                    break;
                    case 4:
                        Entity.slightlyLessRat();
                        Encounter.activeTexture = Config.mouseTexture();
                    break;
                    case 5:
                        Entity.phantasm();
                        Encounter.activeTexture = Config.ghostTexture();
                    break;
                }
            break;
            case 1:
            randomInt = rand.nextInt(3);
                switch(randomInt)
                {
                    case 0:
                        Entity.goblinSkirmisher();
                        Encounter.activeTexture = Config.goblinTexture();
                    break;
                    case 1:
                        Entity.goblinAmbusher();
                        Encounter.activeTexture = Config.goblinTexture();
                    break;
                    case 2:
                        Entity.skeletonArcher();
                        Encounter.activeTexture = Config.skeletonTexture();
                    break;
                    case 3:
                        Entity.phantom();
                        Encounter.activeTexture = Config.ghostTexture();
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
                        Encounter.activeTexture = Config.goblinTexture();
                    break;
                    case 1:
                        Entity.skeletonSoldier();
                        Encounter.activeTexture = Config.skeletonTexture();
                    break;
                    case 2:
                        Entity.direWolf();
                        Encounter.activeTexture = Config.wolfTexture();
                    break;
                    case 3:
                        Entity.skeletonArcher();
                        Encounter.activeTexture = Config.skeletonTexture();
                    break;

                }
            break;
            case 3:
            randomInt = rand.nextInt(5);
                switch(randomInt)
                {
                    case 0:
                        Entity.capraDemon();
                        Encounter.activeTexture = Config.capraTexture();
                    break;
                    case 1:
                        Entity.battleCube();
                        Encounter.activeTexture = Config.cubeTexture();
                    break;
                    case 2:
                        Entity.haywireDroid();
                        Encounter.activeTexture = Config.droidTexture();
                    break;
                    case 3:
                        Entity.banshee();
                        Encounter.activeTexture = Config.ghostTexture();
                    break;
                    case 4:
                        Entity.lich();
                        Encounter.activeTexture = Config.skeletonTexture();
                    break;
                }
            break;
            case 4:
            randomInt = rand.nextInt(4);
                switch(randomInt)
                {
                    case 0:
                        Entity.wraith();
                        Encounter.activeTexture = Config.ghostTexture();
                    break;
                    case 1:
                        Entity.rougeKnight();
                        Encounter.activeTexture = Config.knightTexture();
                    break;
                    case 2:
                        Entity.babyDargon();
                        Encounter.activeTexture = Config.dargonTexture();
                    break;
                    case 3:
                        Entity.griffin();
                        Encounter.activeTexture = Config.griffinTexture();
                    break;
                }
            break;
            default:
            randomInt = rand.nextInt(4);
                switch(randomInt)
                {
                    case 0:
                        Entity.wraith();
                        Encounter.activeTexture = Config.ghostTexture();
                    break;
                    case 1:
                        Entity.rougeKnight();
                        Encounter.activeTexture = Config.knightTexture();
                    break;
                    case 2:
                        Entity.babyDargon();
                        Encounter.activeTexture = Config.dargonTexture();
                    break;
                    case 3:
                        Entity.griffin();
                        Encounter.activeTexture = Config.griffinTexture();
                    break;
                }
            break;
        }
        System.out.println("A " + text.entity.getEntityName() + " has appeared");
        Encounter.battle();
    }
}