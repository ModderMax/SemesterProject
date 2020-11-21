public class Entity 
{
    private String entityName;
    private int entityMaxHealth;
    private int entityHealth;
    private int entityStrength;
    private int entityDexterity;
    private int entityAccuracy;
    private int entityArmor;

    Entity(String entityName, int entityMaxHealth, int entityStrength, int entityDexterity, int entityAccuracy, int entityArmor)
    {
        this.entityName = entityName;
        this.entityMaxHealth = entityMaxHealth;
        this.entityHealth = entityMaxHealth;
        this.entityStrength = entityStrength;
        this.entityDexterity = entityDexterity;
        this.entityAccuracy = entityAccuracy;
        this.entityArmor = entityArmor;
    }

    public void affectEntityHealth(int amount)
    {
        this.entityHealth = this.entityHealth - amount;
        if(this.entityHealth > this.entityMaxHealth)
        {
            this.entityHealth = this.entityMaxHealth;
        }
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

    public static void slime()
    {
        text.entity.setEntityName("Slime");
        text.entity.setEntityHealth(5);
        text.entity.setEntityStrength(0);
        text.entity.setEntityDexterity(-1);
        text.entity.setEntityAccuracy(0);
        text.entity.setEntityArmor(-1);
    }

    public static void wolf()
    {
        text.entity.setEntityName("Wolf");
        text.entity.setEntityHealth(7);
        text.entity.setEntityStrength(0);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(2);
        text.entity.setEntityArmor(0);
    }

    public static void direWolf()
    {
        text.entity.setEntityName("Dire Wolf");
        text.entity.setEntityHealth(10);
        text.entity.setEntityStrength(0);
        text.entity.setEntityDexterity(1);
        text.entity.setEntityAccuracy(3);
        text.entity.setEntityArmor(0);
    }
}
