import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class BankAccount1 {

    private String accountNumber;
    private String accountHolder;
    private double balance;


    public BankAccount1(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance to withdraw $" + amount);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

public class BankAccount{
    public static void main(String[] args) {

        BankAccount1 account = new BankAccount1("123456", "Anuj Soni", 1000.00);


        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: $" + account.getBalance());

               account.deposit(500.00);
        System.out.println("Current Balance: $" + account.getBalance());

        account.withdraw(200.00);
        System.out.println("Current Balance: $" + account.getBalance());

        account.withdraw(1500.00);
    }
}
