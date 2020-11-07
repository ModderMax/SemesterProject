public class Config 
{
    public static int difficulty = 0;
    public static int lootTable = 0;
    public static int scenario = 0;
    public static int xResolution = 500;
    public static int yResolution = 700;
    public static boolean testMode = true;

    public static int getDifficulty() 
    {
        return difficulty;
    }

    public static int getLootTable()
    {
        return lootTable;
    }

    public static int getScenario() 
    {
        return scenario;
    }

    public static int getxResolution() 
    {
        return xResolution;
    }

    public static int getyResolution() 
    {
        return yResolution;
    }

    public static boolean getTestMode() 
    {
        return testMode;
    }
}