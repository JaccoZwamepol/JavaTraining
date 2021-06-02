package DataTypeAssignments.BankAccountExercise;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static void main(String[] args){
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Jacco", 2000, "Rabobank", "NL23RABO043243789234"));
        accounts.add(new Account("Julian", 5000, "ING", "NL20INGB0656437345"));
        accounts.add(new Account("Leon", 10000, "ABN AMRO", "NL14AMRO06436242367"));
        accounts.get(0).deposit(1000);
        accounts.get(1).withdrawMoney(3000);
        accounts.get(2).withdrawMoney(15000);
        accounts.get(0).deposit(1500);
        accounts.get(0).withdrawMoney(100);
        accounts.get(2).deposit(5500);
        accounts.get(1).withdrawMoney(142);

        accounts.get(1).transferTo(accounts.get(2), 500);
        accounts.get(0).transferTo(accounts.get(1), 400);
    }
}
