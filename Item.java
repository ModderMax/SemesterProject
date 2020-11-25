/**
 * ---------------------------------------------------------------------------
 * File name: Entity.java
 * Project name: Semester Project - Text Based RPG
 * ---------------------------------------------------------------------------
 * Creator's name and email: Julian Hyder, hyderjc@etdu.edu
 * Creator's name and email: Maxwell Brown, max@nendal.com
 * Course:  CSCI-1250
 * Creation Date: 11/7/2020 
 * Last updated: 11/24/2020
 * ---------------------------------------------------------------------------
*/

/**
 * Class for creating objects that players can use to attack with
 * 
 *
 * Date created: 11/7/2020
 * 
 * @author Julian hyder
 * @author Maxwell Brown
 */
public class Item 
{
    private int damage;
    private int accuracy;
    private int piercing;
    private int durability;
    private String name;
    private String rarity;
    
    /**
    * Assigns variables to local variables for item
    *
    * Date created: 11/9/2020
    * 
    * @author Julian Hyder
    * @author Maxwell Brown
    */
    public Item(int damage, int accuracy, int piercing, int durability, String name, String rarity)
    {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.piercing = piercing;
        this.durability = durability;
        this.rarity = rarity;
    }

    /**
     * Makes a hashslinging/singing spatula
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void hashSlingingSlashSingingSpatula() // Spongebob reference
    {
        Generator.held = new Item(5, 2, 1, 13, "Hash-Slinging-Slash-Singing Spatula", "Rare");
    }

    /**
     * Makes a comically large spoon
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void theComicallyLargeSpoon() // Meme reference
    {
        Generator.held = new Item(7, 2, 2, 20, "Comically-Large Spoon", "Legendary");
    }

    /**
     * Makes a energy sword
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void energySword() // Halo reference
    {
        Generator.held = new Item(8, 1, 4, 16, "Energy Sword", "Unique");
    }

    /**
     * Makes an act of violence
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void actOfViolence() // Conan Exiles reference
    {
        Generator.held = new Item(13, 0, 2, 17, "Act of Violence", "Legendary");
    }

    /**
     * Makes bradley's saber of wrath
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void bradleysStraightSaberOfWrath() // FMA: Brotherhood reference
    {
        Generator.held = new Item(11, 4, 5, 21, "Bradley's Saber of Wrath", "Legendary");
    }
    
    /**
     * Makes a 3d dimensional maneuver gear
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void threeDimensionalManeuverGear() // AoT reference; Unique
    {
        Generator.held = new Item(7, 7, 2, 10, "3-Dimensional Maneuver Gear", "Unique");
    }

    /**
     * Makes chara's knife
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void charasKnife() // Undertale reference; Rare
    {
        Generator.held = new Item(3, 9, 1, 14, "Chara's Knife", "Rare");
    }

    /**
     * Makes a master sword
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void masterSword() // Legend of Zelda reference; Unique
    {
        Generator.held = new Item(12, 2, 0, 25, "Master Sword", "Unique");
    }

    /**
     * Makes a diamond sword
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void diamondSword() // Minecraft reference; Rare
    {
        Generator.held = new Item(8, 0, 2, 16, "Diamond Sword", "Unique");
    }

    /**
     * Makes a frying pan
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void fryingPan() // Common
    {
        Generator.held = new Item(2, 1, 1, 7, "Frying Pan", "Common");
    }

    /**
     * Makes a slipper
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void slipper() // Common
    {
        Generator.held = new Item(2, 0, 2, 2, "Slipper", "Common");
    }

    /**
     * Makes a broom
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void broom() // Common
    {
        Generator.held = new Item(2, 2, 0, 5, "Broom", "Common");
    }

    /**
     * Makes a fist item
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public static void punch()
    {
        text.inventory.add(new Item(1, 1, 0, 100, "Fist", "Common"));
    }

    /**
     * Getter for rarity
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public int getAccuracy() 
    {
        return accuracy;
    }

    /**
     * Getter for damage
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public int getDamage() 
    {
        return damage;
    }

    /**
     * Getter for durability
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public int getDurability() 
    {
        return durability;
    }

    /**
     * Getter for pierce
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public int getPiercing() 
    {
        return piercing;
    }

    /**
     * Getter for name
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Getter for rarity
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public String getRarity() 
    {
        return rarity;
    }

    /**
     * Sets the durability to 1 -
     * 
     * Date created: 11/13/2020
     * 
     * @author Julian Hdyer
     */
    public void damageDurability() 
    {
        durability --;
    }

    /**
    * passes true or false on durability based on if item has a durability of 0 or less
    *
    * Date created: 11/13/2020
    * 
    * @author Julian Hdyer
    * @author Maxwell Brown
    */
    public boolean isBroken()
    {
        if(durability <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
    * Replaces items back to fist if the durability equals zero for all 6 slots
    *
    * Date created: 11/13/2020
    * 
    * @author Julian Hyder
    * @author Maxwell Brown
    */
    public static void checkAllDurability()
    {
        if(text.inventory.get(0).isBroken())
        {
            text.inventory.set(0, new Item(1, 1, 0, 100, "Fist", "Common"));
        }
        if(text.inventory.get(1).isBroken())
        {
            text.inventory.set(1, new Item(1, 1, 0, 100, "Fist", "Common"));
        }
        if(text.inventory.get(2).isBroken())
        {
            text.inventory.set(2, new Item(1, 1, 0, 100, "Fist", "Common"));
        }
        if(text.inventory.get(3).isBroken())
        {
            text.inventory.set(3, new Item(1, 1, 0, 100, "Fist", "Common"));
        }
        if(text.inventory.get(4).isBroken())
        {
            text.inventory.set(4, new Item(1, 1, 0, 100, "Fist", "Common"));
        }
        if(text.inventory.get(5).isBroken())
        {
            text.inventory.set(5, new Item(1, 1, 0, 100, "Fist", "Common"));
        }
    }
}
