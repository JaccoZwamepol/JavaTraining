package DataTypeAssignments.SuperMarket;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        Inventory inven = new Inventory();
        Scanner input = new Scanner(System.in);
        boolean notExit = true;
        while (notExit)
        {
            System.out.println("which item would you like to add to your cart?");
            String i = input.next();
            if (i.equalsIgnoreCase("view"))
            {
                ShoppingCart.printCart();
                System.out.println("Whould you like to remove any items from your cart? (yes/no)");
                String c = input.next();
                if (c.equalsIgnoreCase("yes"))
                {
                    System.out.println("Which items would you like to remove?");
                    ShoppingCart.printCart();
                    int in = input.nextInt();
                    ShoppingCart.removeFromCart(in-1);
                    Inventory.getItem(in).updateQuantity(1);
                }
            }

            else if (i.equalsIgnoreCase("done"))
            {
                System.out.println("You're total is $" + determineTotal(ShoppingCart.getItems()));
                System.out.println("Thank You for shopping at ''ah.nl''");
                notExit = false;
            }

            else {
                if (Inventory.getItem(Integer.parseInt(i)).getQuantity() > 0) {
                    String item = Inventory.getItem(Integer.parseInt(i)).getName();
                    double price = Inventory.getItem(Integer.parseInt(i)).getPrice();
                    ShoppingCart.addToCart(new Item(item,price));
                }
                else
                    System.out.println(Inventory.getItem(Integer.parseInt(i)).getName() + " is currently out of stock");
            }
        }
    }

    //loops through every item in the list and adds the price of that item
    //(times the quantity of that item) to the total price, then returns
    // the total price
    public static double determineTotal(ArrayList<Item> arrayHolder)
    {
        double total = 0;
        for(Item c : arrayHolder )
        {
            total += (c.getQuantity() * c.getPrice());
        }
        if (total > 20.0)
            return total - 1.0;
        else if (total > 10.0)
            return total - 0.5;
        else
            return total;
    }
}