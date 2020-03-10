import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.util.*;

public class MaterialsList {

    //HashMap<Integer,Item>  AscensionSkillEnhancementMaterials;
    HashMap<Integer,Item>  AscensionSkillEnhancementMaterials;
    ArrayList<String> itemNames;
    //File file = new File("C:\\Users\\User\\IdeaProjects\\InventorySystem\\MaterialsFGO.txt");

    String file = "C:\\Users\\User\\IdeaProjects\\InventorySystem\\FGOMats.txt";


    //C:\Users\User\IdeaProjects\InventorySystem
    public MaterialsList(){
        this.AscensionSkillEnhancementMaterials =  new HashMap<>();
        this.itemNames = new ArrayList<String>();

    }


    public void blankItemList() throws FileNotFoundException {
        String line = "";
        String commaSplit = ",";
        int j = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] lineFromFile = line.split(commaSplit);
                Item i = new Item(lineFromFile[0],Integer.parseInt(lineFromFile[1]),Integer.parseInt(lineFromFile[2]));
                itemNames.add(lineFromFile[0]);
                AscensionSkillEnhancementMaterials.put(j,i);
                j++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    public void printItem(int index)
    {
        Item i = AscensionSkillEnhancementMaterials.get(index);

        if(!AscensionSkillEnhancementMaterials.containsValue(index))
            System.out.println(AscensionSkillEnhancementMaterials.get(index).printI());
        else
            System.out.println("None");

    }
    */
    public Item getItem(String name)
    {
        int index = itemNames.indexOf(name);
        Item i = AscensionSkillEnhancementMaterials.get(index);
        return i;
    }

    public void changeValues(String name, int amount)
    {
        Item i = getItem(name);
        i.setItemAmount(amount);
        //System.out.println(AscensionSkillEnhancementMaterials.get(index).printI());
    }

    private static Scanner x;
    public void saveFile()
    {
        String tempFile = "temp.txt";
        File oldFile = new File("MaterialsFGO");
        File newFile = new File(tempFile);
        String name = ""; String amount = ""; String rarity = "";
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(file));
            x.useDelimiter("[,\n]");
            while(x.hasNext())
            {
                name = x.next();
                amount = x.next();
                rarity = x.next();
                pw.println(name + "," +amount+","+rarity);
            }
            x.close();
            pw.close();
            oldFile.delete();
            File dump = new File("MaterialsFGO");
            newFile.renameTo(dump);
        }
        catch(Exception e)
        {

        }
    }
}
