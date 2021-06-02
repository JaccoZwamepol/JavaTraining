package DataTypeAssignments.SuperMarket;
import java.util.ArrayList;

class ShoppingCart {
    private static ArrayList<Item> shoppingList = new ArrayList<Item>();

    public static void addToCart(Item item){
        boolean isUnique = true;
        for(Item i : shoppingList)
        {
            if (i.getName().equals(item.getName()))
            {
                i.updateQuantity(1);
                isUnique = false;
            }
        }
        if (isUnique)
        {
            shoppingList.add(item);
        }
    }

    public static void removeFromCart(int i)
    {
        shoppingList.get(i).updateQuantity(-1);
        if (shoppingList.get(i).getQuantity() == 0)
            shoppingList.remove(i);
    }

    public static void printCart()
    {
        System.out.println("your cart contains: ");
        for(Object i : shoppingList )
        {
            System.out.println(((Item) i).getQuantity() + " " + ((Item) i).getName() + "(s), Costing $" + ((Item) i).getPrice() + " each" );
        }
    }

    public static ArrayList<Item> getItems(){
        return shoppingList;
    }
}
