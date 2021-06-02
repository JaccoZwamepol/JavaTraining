package DataTypeAssignments.SuperMarket;
import java.util.ArrayList;

public class CashRegister {
    private static double DISCOUNT10 = 0.5;
    private static double DISCOUNT20 = 1.0;
    private static double ZERO = 0.0;
    public static void cashRegister(ArrayList<Item> arrayHolder)
    {
        double total = 0;
        for(Item c : arrayHolder )
        {
            total += (c.getQuantity() * c.getPrice());
        }
        if (total > 20.0)
            printCart(total - DISCOUNT20, DISCOUNT20);
        else if (total > 10.0)
            printCart(total - DISCOUNT10, DISCOUNT10);
        else
            printCart(total, ZERO);
    }

    static void printCart(double t, double d){
        System.out.println("You're total is $" + t);
        System.out.println("And you're total discount is $" + d);
        System.out.println("Thank You for shopping at ''ah.nl''");
    }
}
