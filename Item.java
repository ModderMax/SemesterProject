public class Item 
{
    private int damage;
    private int accuracy;
    private int piercing;
    private int durability;
    private String name;
    
    public Item(int damage, int accuracy, int piercing, int durability, String name)
    {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.piercing = piercing;
        this.durability = durability;
    }

    public static void hashSlingingSlashSingingSpatula() // Spongebob reference; Rare
    {
        text.inventory.add(new Item(5, 2, 1, 13, "Hash-Slinging-Slash-Singing Spatula"));
    }

    public static void theComicallyLargeSpoon() // Meme reference; Legendary
    {
        text.inventory.add(new Item(7, 2, 2, 20, "Comically-Large Spoon"));
    }

    public static void energySword() // Halo reference; Unique
    {
        text.inventory.add(new Item(8, 1, 4, 16, "Energy Sword"));
    }

    public static void actOfViolence() // Conan Exiles reference; Legendary
    {
        text.inventory.add(new Item(13, 0, 2, 17, "Act of Violence"));
    }

    public static void bradleysStraightSaberOfWrath() // FMA: Brotherhood reference; Legendary
    {
        text.inventory.add(new Item(11, 4, 5, 21, "Bradley's Saber of Wrath"));
    }
    
    public static void threeDimensionalManeuverGear() // AoT reference; Unique
    {
        text.inventory.add(new Item(7, 7, 2, 10, "3-Dimensional Maneuver Gear"));
    }

    public static void charasKnife() // Undertale reference; Rare
    {
        text.inventory.add(new Item(3, 9, 1, 14, "Chara's Knife"));
    }

    public static void masterSword() // Legend of Zelda reference; Unique
    {
        text.inventory.add(new Item(12, 2, 0, 25, "3-Dimensional Maneuver Gear"));
    }

    public static void diamondSword() // Minecraft reference; Rare
    {
        text.inventory.add(new Item(8, 0, 2, 16, "Diamond Sword"));
    }

    public static void fryingPan() // Common
    {

    }

    public static void slipper() // Common
    {

    }

    public static void punch()
    {
        text.inventory.add(new Item(1, 0, 0, 100, "Fist"));
    }

    public int getAccuracy() 
    {
        return accuracy;
    }

    public int getDamage() 
    {
        return damage;
    }

    public int getDurability() 
    {
        return durability;
    }

    public int getPiercing() 
    {
        return piercing;
    }

    public String getName() 
    {
        return name;
    }
}
