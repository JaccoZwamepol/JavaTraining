package DataTypeAssignments.SuperMarket;
import java.util.ArrayList;

public class Inventory {
    //creating the invetory list
    private static Item Soap = new Item("Soap", 28, 3.0);
    private static Item Cereals = new Item("Cereals", 30, 2.5);
    private static Item ChineseVegetables = new Item("Chinese vegetables", 20, 5.0);
    private static Item Yoghourt = new Item("Yoghourt", 25, 2.0);
    private static Item Diapers = new Item("Diapers", 60, 10.0);
    private static ArrayList<Item> inventoryHolder = new ArrayList<Item>();

    //adds each item of the inventory to an array list (see above) and then prints it
    public Inventory()
    {
        inventoryHolder.clear();
        inventoryHolder.add(Soap);
        inventoryHolder.add(Cereals);
        inventoryHolder.add(ChineseVegetables);
        inventoryHolder.add(Yoghourt);
        inventoryHolder.add(Diapers);

        printInventory(inventoryHolder);
    }

    //if a call number is called, the corresponding inventory member is returned
    public static Item getItem( int input)
    {
        inventoryHolder.get(input - 1).updateQuantity(-1);
        return inventoryHolder.get(input - 1);
    }

    //prints the inventory with an call number
    public void printInventory(ArrayList<Item> arrayHolder)
    {

        int c = 1;
        for(Object i : arrayHolder )
        {
            System.out.println("To add " +  ((Item) i).getName() + " to your cart, type "+ c);
            c++;
        }

        System.out.println("To view what is in your cart, type VIEW");
        System.out.println("To check-out, type DONE");
    }
}
