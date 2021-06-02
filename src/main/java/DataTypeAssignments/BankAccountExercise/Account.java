package DataTypeAssignments.BankAccountExercise;
public class Account {
    private String name;
    private int balance;
    private String bankName;
    private String iban;
    public Account(String name, int balance, String bankName, String iban) {
        this.name = name;
        this.balance = balance;
        this.bankName = bankName;
        this.iban = iban;
    }
    public void withdrawMoney(int amount){
        System.out.println("Withdrawal");
        System.out.println("Account: " + this.iban + " --> Old balance: " + this.balance);
        this.balance -= amount;
        System.out.println("Account: " + this.iban + " --> New balance: " + this.balance);
    }
    public void deposit(int amount) {
        System.out.println("Deposit");
        System.out.println("Account: " + this.iban + " --> Old balance: " + this.balance);
        this.balance += amount;
        System.out.println("Account: " + this.iban + " --> New balance: " + this.balance);
    }
    public void transferTo(Account account, int amount){
        System.out.println("Transfer");
        this.withdrawMoney(amount);
        account.deposit(amount);
    }
}
