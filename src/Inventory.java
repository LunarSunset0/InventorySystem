import java.io.FileNotFoundException;
import java.util.HashMap;

public class Inventory {

    public static void main(String args[]) throws FileNotFoundException {
        /*
        String AscensionSkillEnhancementMaterials[] =
                {"Deadly Poisonous Needle",
                        "Dragon Fang",
                        "Evil Bone",
                        "Fool's Chain",
                        "Mystic Spinal Fluid",
                        "Proof of Hero",
                        "Reactive Gunpowder",
                        "Stake of Wailing Night",
                        "Void's Dust"
                };
        */

        MaterialsList mylist = new MaterialsList();
        mylist.blankItemList();
        mylist.changeValues("Horsehoe",10);
        mylist.changeValues("Horsehoe",10);
        //mylist.printItem(0);
        //mylist.printItem(1);
        //Item i = new Item("Dragon Fang",0,0);
        //i.printI();
    }
}
