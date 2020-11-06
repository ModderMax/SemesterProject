import java.util.Random;

public class Generator 
{
    static Random rand = new Random();

    public static int randomBetween(int num1, int num2)
    {
        int disparity = num2 - num1 + 1;
        return rand.nextInt(disparity) + num1;
    }

    public static void randomLoot() {
        int randomInt = rand.nextInt(100);

        //Flame Sword
        if(randomInt == 0)
        {
            text.addItem("Flame Sword", 5, "Dexterity", 1, 0);
        }
        else
        {
            System.out.println("yeet");
        }
    }
}
