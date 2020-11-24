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
        text.player.checkLevelup();
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
        if(Generator.doesHit(0, false))
        {
            int x = text.entity.getEntityStrength() - text.player.getPlayerArmor();
            if(x >= 0)
            {
                text.player.affectPlayerHealth(x);
            }
            else
            {
                text.entity.affectEntityHealth(x * -1);
            }
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

    public static void blueSlime() // Level 1 Enemy
    {
        text.entity.setEntityName("Blue Slime");
        text.entity.setEntityHealth(6);
        text.entity.setEntityStrength(1);
        text.entity.setEntityDexterity(-1);
        text.entity.setEntityAccuracy(0);
        text.entity.setEntityArmor(-1);
    }

    public static void wolf() // Level 1 Enemy
    {
        text.entity.setEntityName("Wolf");
        text.entity.setEntityHealth(7);
        text.entity.setEntityStrength(1);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(0);
    }

    public static void goblinSkirmisher() // Level 2 Enemy
    {
        text.entity.setEntityName("Goblin Skirmisher");
        text.entity.setEntityHealth(6);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(2);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(1);    
    }

    public static void goblinAmbusher() // Level 2 Enemy
    {
        text.entity.setEntityName("Goblin Ambusher");
        text.entity.setEntityHealth(4);
        text.entity.setEntityStrength(3);
        text.entity.setEntityDexterity(3);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(0);
    }
    
    public static void wraith() // Level 5 Enemy
    {
        text.entity.setEntityName("Wraith");
        text.entity.setEntityHealth(23);
        text.entity.setEntityStrength(5);
        text.entity.setEntityDexterity(3);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(3);
    }

    public static void goblinChef() // Level 3 Enemy
    {
        text.entity.setEntityName("Goblin Chef");
        text.entity.setEntityHealth(6);
        text.entity.setEntityStrength(3);
        text.entity.setEntityDexterity(3);
        text.entity.setEntityAccuracy(3);
        text.entity.setEntityArmor(1);
    }

    public static void skeleton() // Level 2 Enemy
    {
        text.entity.setEntityName("Skeleton");
        text.entity.setEntityHealth(8);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(3);
        text.entity.setEntityArmor(1);
    }

    public static void skeletonSoldier() // Level 3 Enemy
    {
        text.entity.setEntityName("Armored Skeleton");
        text.entity.setEntityHealth(8);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(3);
        text.entity.setEntityArmor(3);
    }

    public static void direWolf() // Level 3 Enemy
    {
        text.entity.setEntityName("Dire Wolf");
        text.entity.setEntityHealth(10);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(3);
        text.entity.setEntityArmor(0);
    }

    public static void capraDemon()
    {
        text.entity.setEntityName("Capra Demon"); // Level 4 Enemy
        text.entity.setEntityHealth(9);
        text.entity.setEntityStrength(4);
        text.entity.setEntityDexterity(3);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(2);
    }

    public static void battleCube()
    {
        text.entity.setEntityName("Battle Cube"); // Level 4 Enemy
        text.entity.setEntityHealth(7);
        text.entity.setEntityStrength(2);
        text.entity.setEntityDexterity(2);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(4);
    }
    
    public static void haywireDroid()
    {
        text.entity.setEntityName("Haywire Droid"); // Level 4 Enemy
        text.entity.setEntityHealth(6);
        text.entity.setEntityStrength(1);
        text.entity.setEntityDexterity(3);
        text.entity.setEntityAccuracy(3);
        text.entity.setEntityArmor(5);
    }
}
