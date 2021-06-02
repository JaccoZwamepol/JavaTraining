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
                CashRegister.cashRegister(ShoppingCart.getItems());
                notExit = false;
            }

            else {
                Item item = Inventory.getItem(Integer.parseInt(i));
                if (item.getQuantity() > 0) {
                    item.updateQuantity(-1);
                    ShoppingCart.addToCart(new Item(item.getName(),item.getPrice()));
                }
                else
                    System.out.println(Inventory.getItem(Integer.parseInt(i)).getName() + " are currently out of stock");
            }
        }
    }
}