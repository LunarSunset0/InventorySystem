public class Item {
    String ItemName;
    int ItemAmount;
    int ItemRarity;
    public Item(){
        this.ItemName = "";
        this.ItemAmount = 0;
        this.ItemRarity = 0;
    }
    public Item(String name, int amount, int rarity){
        this.ItemName = name;
        this.ItemAmount = amount;
        this.ItemRarity = rarity;
    }


    public String printI()
    {
        String line = ItemName+", "+ItemAmount+", "+ ItemRarity;
        return line;
    }

    public void setItemName(String name){
        this.ItemName = name;
    }
    public void setItemAmount(int amount){
        this.ItemAmount = amount;
    }
    public void setItemRarity(int rarity){
        this.ItemRarity = rarity;
    }

    public String getItemName(){
        return ItemName;
    }
    public int getItemAmount(){
        return ItemAmount;
    }
    public int getItemRarity(){
        return ItemRarity;
    }
}
