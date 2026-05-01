import java.util.Scanner;

class BankAccount {
    String owner, pin;
    double balance;

    BankAccount(String owner, String pin, double balance) {
        this.owner = owner;
        this.pin = pin;
        this.balance = balance;
    }

    boolean verifypin(String p) { return pin.equals(p); }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited Rs." + amt + " | Balance: Rs." + balance);
    }

    void withdraw(double amt) {
        if (amt > balance) System.out.println("Insufficient balance!");
        else {
            balance -= amt;
            System.out.println("Withdrawn Rs." + amt + " | Balance: Rs." + balance);
        }
    }

    void checkBalance() {
        System.out.println("Account: " + owner + " | Balance: Rs." + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount("Rahul", "1234", 10000);

        System.out.print("Enter PIN: ");
        if (!acc.verifypin(sc.nextLine())) { System.out.println("Wrong PIN!"); return; }
        System.out.println("Welcome, " + acc.owner + "!");

        while (true) {
            System.out.println("\n1.Balance  2.Deposit  3.Withdraw  4.Exit");
            System.out.print("Choose: ");
            switch (sc.nextLine()) {
                case "1": acc.checkBalance(); break;
                case "2": System.out.print("Amount: "); acc.deposit(Double.parseDouble(sc.nextLine())); break;
                case "3": System.out.print("Amount: "); acc.withdraw(Double.parseDouble(sc.nextLine())); break;
                case "4": System.out.println("Goodbye!"); return;
            }
        }
    }
}