package lesson3;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private User owner;

    public BankAccount(int accountNumber, double balance, User owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit can't be negative");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        if (amount > balance) {
            System.out.println("Oops, not enough money.");
            return;
        }
        balance -= amount;
        System.out.println("Cash balance after operation: " + balance);
    }

    public void showBalance() {
        System.out.println(owner.getName() + "'s balance on account " + accountNumber + ": " + balance);
    }
}
