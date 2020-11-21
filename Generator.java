import java.util.Random;

public class Generator 
{
    static Random rand = new Random();

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
        int randomInt = rand.nextInt(100);

        switch(randomInt)
        {
            case 0:
            Item.theComicallyLargeSpoon();
            break;
        }
    }

    public static void randomUnique()
    {
        int randomInt = rand.nextInt(100);

        switch(randomInt)
        {
            case 0:
            Item.energySword();
            break;
        }
    }

    public static void randomRare()
    {

    }

    public static void randomCommon()
    {

    }
}
