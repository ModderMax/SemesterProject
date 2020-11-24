public class Item 
{
    private int damage;
    private int accuracy;
    private int piercing;
    private int durability;
    private String name;
    private String rarity;
    
    public Item(int damage, int accuracy, int piercing, int durability, String name, String rarity)
    {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.piercing = piercing;
        this.durability = durability;
        this.rarity = rarity;
    }

    public static void hashSlingingSlashSingingSpatula() // Spongebob reference
    {
        Generator.held = new Item(5, 2, 1, 13, "Hash-Slinging-Slash-Singing Spatula", "Rare");
    }

    public static void theComicallyLargeSpoon() // Meme reference
    {
        Generator.held = new Item(7, 2, 2, 20, "Comically-Large Spoon", "Legendary");
    }

    public static void energySword() // Halo reference
    {
        Generator.held = new Item(8, 1, 4, 16, "Energy Sword", "Unique");
    }

    public static void actOfViolence() // Conan Exiles reference
    {
        Generator.held = new Item(13, 0, 2, 17, "Act of Violence", "Legendary");
    }

    public static void bradleysStraightSaberOfWrath() // FMA: Brotherhood reference
    {
        Generator.held = new Item(11, 4, 5, 21, "Bradley's Saber of Wrath", "Legendary");
    }
    
    public static void threeDimensionalManeuverGear() // AoT reference; Unique
    {
        Generator.held = new Item(7, 7, 2, 10, "3-Dimensional Maneuver Gear", "Unique");
    }

    public static void charasKnife() // Undertale reference; Rare
    {
        Generator.held = new Item(3, 9, 1, 14, "Chara's Knife", "Rare");
    }

    public static void masterSword() // Legend of Zelda reference; Unique
    {
        Generator.held = new Item(12, 2, 0, 25, "Master Sword", "Unique");
    }

    public static void diamondSword() // Minecraft reference; Rare
    {
        Generator.held = new Item(8, 0, 2, 16, "Diamond Sword", "Unique");
    }

    public static void fryingPan() // Common
    {
        Generator.held = new Item(1, 1, 1, 9, "Frying Pan", "Common");
    }

    public static void slipper() // Common
    {
        Generator.held = new Item(2, 0, 0, 9, "Slipper", "Common");
    }

    public static void punch()
    {
        text.inventory.add(new Item(1, 1, 0, 100, "Fist", "Common"));
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

    public String getRarity() 
    {
        return rarity;
    }
}
