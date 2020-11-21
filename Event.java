import javax.swing.JOptionPane;

/**
 * Event class for handling events that take place outside of fights and trials.
 *
 * Date created: 11/7/2020
 * 
 * @author Maxwell Brown
 */
public class Event
{
    private static int currentEventId; // for keeping track of what event is active for the sake of confirm and reject working properly.


    public static void confirmOp()
    {
        switch(Event.currentEventId)
        {
            case 0:
            introduction1();
            break;
        }

    }

    /**
     * Method for taking a negative affirmation from the player
     * 
     * Date created: 10/24/2020
     * 
     */
    public static void rejectOp()
    {
        System.out.println("yoink");
    }
    
    public static void introduction0() {
        Event.currentEventId = 0;
        text.button1.setEnabled(false);
        text.button1.setVisible(false);
        text.button3.setEnabled(false);
        text.button3.setVisible(false);
        text.text0.setEnabled(false);
        text.text0.setVisible(false);
        text.label0.setText("Welcome to the dungeon.");
        text.button2.setText("Ok");
    }

    public static void introduction1()
    {
        Encounter.tutorial();
    }

    public static void attackInventory()
    {
        Object[] options = text.getItemArray();
        int answer = JOptionPane.showOptionDialog(null, "Select which weapon to attack with", "Calculator", JOptionPane.DEFAULT_OPTION,
                JOptionPane.DEFAULT_OPTION, null, options, options[0]);
        switch(answer)
        {
            case 0:
            if(Generator.doesHit(text.inventory.get(0).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(0).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                damage = text.inventory.get(0).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getEntityHealth() + "/" + text.entity.getEntityMaxHealth());
            }
            break;
            case 1:
            if(Generator.doesHit(text.inventory.get(1).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(1).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                damage = text.inventory.get(0).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getEntityHealth() + "/" + text.entity.getEntityMaxHealth());
            }
            break; 
            case 2:
            if(Generator.doesHit(text.inventory.get(2).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(2).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                damage = text.inventory.get(0).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getEntityHealth() + "/" + text.entity.getEntityMaxHealth());
            }
            break;
            case 3:
            if(Generator.doesHit(text.inventory.get(3).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(3).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                damage = text.inventory.get(0).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getEntityHealth() + "/" + text.entity.getEntityMaxHealth());
            }
            break; 
            case 4:
            if(Generator.doesHit(text.inventory.get(4).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(4).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                damage = text.inventory.get(0).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getEntityHealth() + "/" + text.entity.getEntityMaxHealth());
            }
            break; 
            case 5:
            if(Generator.doesHit(text.inventory.get(5).getAccuracy(), true))
            {
                int damage = text.entity.getEntityArmor() - text.inventory.get(5).getPiercing();
                if(damage < 0)
                {
                    damage = 0;
                }
                damage = text.inventory.get(0).getDamage() - damage;
                text.entity.affectEntityHealth(damage);
                text.label1.setText(text.entity.getEntityName() + ": " + text.entity.getEntityHealth() + "/" + text.entity.getEntityMaxHealth());
            }
            break; 
        }
    }


}
