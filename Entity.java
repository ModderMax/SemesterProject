public class Entity 
{
    private String entityName;
    private int entityMaxHealth;
    private int entityHealth;
    private int entityStrength;
    private int entityDexterity;
    private int entityAccuracy;
    private int entityArmor;
    private int entityExp;

    Entity(String entityName, int entityMaxHealth, int entityStrength, int entityDexterity, int entityAccuracy, int entityArmor, int entityExp)
    {
        this.entityName = entityName;
        this.entityMaxHealth = entityMaxHealth;
        this.entityHealth = entityMaxHealth;
        this.entityStrength = entityStrength;
        this.entityDexterity = entityDexterity;
        this.entityAccuracy = entityAccuracy;
        this.entityArmor = entityArmor;
        this.entityExp = entityExp;
    }

    public static void kill()
    {
        Generator.randomRarity();
        ChangeUI.enableAll(true, true, false, false, false, false, false, true, true, true);
        ChangeUI.locationButton(120, 30, 120, 600,
                                120, 30, 280, 600, 
                                120, 30, 120, 600, 
                                120, 30, 280, 600, 
                                text.button4.getPreferredSize().width, text.button4.getPreferredSize().height, 100, 10, 
                                text.button5.getPreferredSize().width, text.button5.getPreferredSize().height, 100, 10);
        ChangeUI.locationField(500, text.label0.getPreferredSize().height + 30, 210, 500,
                               500, text.label1.getPreferredSize().height, 220, 570,
                               400, text.label2.getPreferredSize().height + 200, 40, 10,
                               text.text0.getPreferredSize().width, text.text0.getPreferredSize().height, 190, 420);
        ChangeUI.textAll("Pick Up", "Discard", "x", "y", "z", "a", "b",
                            "<html>Loot:<br>" +
                            "+ " + text.entity.getEntityExp() + " EXP earned<br>" + 
                            "+ " + Generator.held.getName() + ", " + Generator.held.getRarity(),
                            text.entity.getEntityName() + ": Dead",
                            Config.graveTexture());
        text.player.setExperience(text.player.getExperience() + text.entity.getEntityExp());
    }

    public void affectEntityHealth(int amount)
    {
        this.entityHealth = this.entityHealth - amount;
        if(this.entityHealth > this.entityMaxHealth)
        {
            this.entityHealth = this.entityMaxHealth;
        }
    }

    public String getHealthString()
    {
        int num = text.entity.getEntityHealth();
        String out = "";
        do
        {
            out += "❤ ";
            num --;
        }while(num > 0);
        return out;
    }

    public boolean isAlive()
    {
        if(entityHealth <= 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static void attack()
    {
        int x = text.entity.getEntityStrength() - text.player.getPlayerArmor();
        if(Generator.doesHit(0, false))
        {
            if(x > 0)
            {
                System.out.println("The " + text.entity.getEntityName() + " dealt " + x + " damage");
                text.player.affectPlayerHealth(x);
            }
            else if(x == 0)
            {
                System.out.println("You blocked the " + text.entity.getEntityName() + "'s attack");
            }
            else
            {
                System.out.println("You blocked the " + text.entity.getEntityName() + "'s attack");
                System.out.println("The " + text.entity.getEntityName() + " took " + x + " damage as a recussion");
                text.entity.affectEntityHealth(x * -1);
            }
        }
        else
        {
            // System.out.println("The " + text.entity.getEntityName() + " missed you");
        }
        
        text.player.checkDeath();
        text.label0.setText(text.player.getUsername() + ": " + text.player.getHealthString());
    }

    public String getEntityName() 
    {
        return entityName;
    }

    public int getEntityHealth() 
    {
        return entityHealth;
    }

    public int getEntityMaxHealth() 
    {
        return entityMaxHealth;
    }

    public int getEntityStrength() 
    {
        return entityStrength;
    }

    public int getEntityDexterity() 
    {
        return entityDexterity;
    }

    public int getEntityAccuracy() 
    {
        return entityAccuracy;
    }

    public int getEntityArmor() 
    {
        return entityArmor;
    }

    public int getEntityExp() 
    {
        return entityExp;
    }

    public void setEntityName(String entityName) 
    {
        this.entityName = entityName;
    }

    public void setEntityHealth(int entityMaxHealth) 
    {
        this.entityMaxHealth = entityMaxHealth;
        this.entityHealth = entityMaxHealth;
    }

    public void setEntityStrength(int entityStrength) 
    {
        this.entityStrength = entityStrength;
    }

    public void setEntityDexterity(int entityDexterity) 
    {
        this.entityDexterity = entityDexterity;
    }

    public void setEntityAccuracy(int entityAccuracy) 
    {
        this.entityAccuracy = entityAccuracy;
    }

    public void setEntityArmor(int entityArmor) 
    {
        this.entityArmor = entityArmor;
    }

    public void setEntityExp(int entityExp) 
    {
        this.entityExp = entityExp;
    }

    public static void giantRat() // Level 1 Enemy
    {
        text.entity.setEntityName("Giant Rat");
        text.entity.setEntityHealth(4);
        text.entity.setEntityStrength(1);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(1);
        text.entity.setEntityArmor(0);
        text.entity.setEntityExp(10);
    }

    public static void slightlyLessRat() // Level 1/2 Enemy
    {
        text.entity.setEntityName("Slightly Less Giant Rat");
        text.entity.setEntityHealth(3);
        text.entity.setEntityStrength(1);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(1);
        text.entity.setEntityArmor(0);
        text.entity.setEntityExp(8);
    }
    
    public static void greenSlime() // Level 1 Enemy
    {
        text.entity.setEntityName("Green Slime");
        text.entity.setEntityHealth(5);
        text.entity.setEntityStrength(1);
        text.entity.setEntityDexterity(-1);
        text.entity.setEntityAccuracy(0);
        text.entity.setEntityArmor(-1);
        text.entity.setEntityExp(15);
    }

    public static void phantasm() // Level 1 Enemy
    {
        text.entity.setEntityName("Phantasm");
        text.entity.setEntityHealth(4);
        text.entity.setEntityStrength(1);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(0);
        text.entity.setEntityArmor(-2);
        text.entity.setEntityExp(15);
    }

    public static void blueSlime() // Level 1 Enemy
    {
        text.entity.setEntityName("Blue Slime");
        text.entity.setEntityHealth(6);
        text.entity.setEntityStrength(1);
        text.entity.setEntityDexterity(-1);
        text.entity.setEntityAccuracy(0);
        text.entity.setEntityArmor(-1);
        text.entity.setEntityExp(17);
    }

    public static void wolf() // Level 1 Enemy
    {
        text.entity.setEntityName("Wolf");
        text.entity.setEntityHealth(7);
        text.entity.setEntityStrength(1);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(0);
        text.entity.setEntityExp(17);
    }

    public static void goblinSkirmisher() // Level 2 Enemy
    {
        text.entity.setEntityName("Goblin Skirmisher");
        text.entity.setEntityHealth(6);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(1);
        text.entity.setEntityExp(19);    
    }

    public static void goblinAmbusher() // Level 2 Enemy
    {
        text.entity.setEntityName("Goblin Ambusher");
        text.entity.setEntityHealth(4);
        text.entity.setEntityStrength(3);
        text.entity.setEntityDexterity(2);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(0);
        text.entity.setEntityExp(21);
    }
    
    public static void phantom() // Level 2 Enemy
    {
        text.entity.setEntityName("Phantom");
        text.entity.setEntityHealth(5);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(3);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(0);
        text.entity.setEntityExp(23);
    }

    public static void goblinChef() // Level 3 Enemy
    {
        text.entity.setEntityName("Goblin Chef");
        text.entity.setEntityHealth(6);
        text.entity.setEntityStrength(3);
        text.entity.setEntityDexterity(3);
        text.entity.setEntityAccuracy(3);
        text.entity.setEntityArmor(1);
        text.entity.setEntityExp(26);
    }

    public static void skeletonArcher() // Level 3 Enemy
    {
        text.entity.setEntityName("Skeleton Archer");
        text.entity.setEntityHealth(8);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(3);
        text.entity.setEntityArmor(1);
        text.entity.setEntityExp(27);
    }

    public static void skeletonSoldier() // Level 3 Enemy
    {
        text.entity.setEntityName("Skeleton Soldier");
        text.entity.setEntityHealth(8);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(3);
        text.entity.setEntityArmor(3);
        text.entity.setEntityExp(29);
    }

    public static void direWolf() // Level 3 Enemy
    {
        text.entity.setEntityName("Dire Wolf");
        text.entity.setEntityHealth(10);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(3);
        text.entity.setEntityArmor(0);
        text.entity.setEntityExp(31);
    }

    public static void capraDemon() // Level 4 Enemy
    {
        text.entity.setEntityName("Capra Demon"); 
        text.entity.setEntityHealth(9);
        text.entity.setEntityStrength(4);
        text.entity.setEntityDexterity(2);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(1);
        text.entity.setEntityExp(30);
    }

    public static void battleCube() // Level 4 Enemy
    {
        text.entity.setEntityName("Battle Cube"); 
        text.entity.setEntityHealth(7);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(2);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(4);
        text.entity.setEntityExp(31);
    }
    
    public static void haywireDroid() // Level 4 Enemy
    {
        text.entity.setEntityName("Haywire Droid");
        text.entity.setEntityHealth(6);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(3);
        text.entity.setEntityArmor(5);
        text.entity.setEntityExp(31);
    }

    public static void banshee() // Level 4 Enemy
    {
        text.entity.setEntityName("Banshee");
        text.entity.setEntityHealth(5);
        text.entity.setEntityStrength(7);
        text.entity.setEntityDexterity(4);
        text.entity.setEntityAccuracy(1);
        text.entity.setEntityArmor(-1);
        text.entity.setEntityExp(35);
    }

    public static void lich() // Level 4 Enemy
    {
        text.entity.setEntityName("Lich");
        text.entity.setEntityHealth(6);
        text.entity.setEntityStrength(6);
        text.entity.setEntityDexterity(2);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(2);
        text.entity.setEntityExp(37);
    }

    public static void rougeKnight() // Level 5 Enemy
    {
        text.entity.setEntityName("Rouge Knight");
        text.entity.setEntityHealth(18);
        text.entity.setEntityStrength(4);
        text.entity.setEntityDexterity(5);
        text.entity.setEntityAccuracy(4);
        text.entity.setEntityArmor(4);
        text.entity.setEntityExp(42);
    }

    public static void babyDragon() // Level 5 Enemy
    {
        text.entity.setEntityName("Baby Dragon");
        text.entity.setEntityHealth(21);
        text.entity.setEntityStrength(4);
        text.entity.setEntityDexterity(2);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(3);
        text.entity.setEntityExp(46);
    }

    public static void griffin() // Level 5 Enemy
    {
        text.entity.setEntityName("Griffin");
        text.entity.setEntityHealth(21);
        text.entity.setEntityStrength(6);
        text.entity.setEntityDexterity(2);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(2);
        text.entity.setEntityExp(49);
    }

    public static void wraith() // Level 5 Enemy
    {
        text.entity.setEntityName("Wraith");
        text.entity.setEntityHealth(20);
        text.entity.setEntityStrength(8);
        text.entity.setEntityDexterity(2);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(1);
        text.entity.setEntityExp(50);
    }


    public static void hydra() // Boss Enemy
    {
        text.entity.setEntityName("Hydra");
        text.entity.setEntityHealth(48);
        text.entity.setEntityStrength(8);
        text.entity.setEntityDexterity(2);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(10);
        text.entity.setEntityExp(100);
    }

    public static void cerberus() // Boss Enemy
    {
        text.entity.setEntityName("Cerberus");
        text.entity.setEntityHealth(28);
        text.entity.setEntityStrength(16);
        text.entity.setEntityDexterity(2);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(4);
        text.entity.setEntityExp(100);
    }

    public static void medusa() // Boss Enemy
    {
        text.entity.setEntityName("Medusa");
        text.entity.setEntityHealth(24);
        text.entity.setEntityStrength(8);
        text.entity.setEntityDexterity(9);
        text.entity.setEntityAccuracy(8);
        text.entity.setEntityArmor(3);
        text.entity.setEntityExp(100);
    }

}
