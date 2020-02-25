import java.util.HashMap;

public class MaterialsList {

    HashMap<Integer,Item>  AscensionSkillEnhancementMaterials;

    public MaterialsList(){
        this.AscensionSkillEnhancementMaterials =  new HashMap<>();
    }


    public void blankItemList()
    {
        Item i = new Item("Dragon Fang",0,0);
        this.AscensionSkillEnhancementMaterials.put(0,i);

    }

    public void printItem(int index)
    {
        Item i = AscensionSkillEnhancementMaterials.get(index);

        if(!AscensionSkillEnhancementMaterials.containsValue(index))
            System.out.println(AscensionSkillEnhancementMaterials.get(index).printI());
        else
            System.out.println("None");

    }
}
