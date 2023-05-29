package chap3;

public class BankAccount {
    int i = 0;  // i is an attribute (variable inside class); default value = 0 
                //=> better initialize anyway
    private String owner;
    private double balance;

    // CONSTRUCTORS
    public BankAccount (String name, double newBalance) {
        System.out.println("Welcome!");

        owner = name;
        balance = newBalance;
    }
    public BankAccount () {
        owner = "Unnamed";
        balance = 0;
    }

    public static void main (String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println(acc.i);

        int j; // j is a variable (variable inside method/ conditional statement) => no default value
        j = 0; //=> must initialize
        System.out.println(j);

        BankAccount acc1;
        acc1 = new BankAccount();

        BankAccount acc2 = new BankAccount("Tieu", 50000);
    }
}