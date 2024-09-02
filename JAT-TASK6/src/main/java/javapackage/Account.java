package javapackage;

public class Account {
    // Data member
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0; // Default balance value
    }

    // Constructor with initial balance as argument
    
    public Account(double initialBalance) {
    	
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Insufficient funds. Withdrawal amount exceeds the balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the balance
    public double checkBalance() {
        return balance;
    }

    // Main method to demonstrate the use of the Account class
    public static void main(String[] args) {
        // Using the no-argument constructor
        Account account1 = new Account();
        System.out.println("Account 1 Initial Balance: " + account1.checkBalance());
        
        account1.deposit(5000);
        
        account1.withdraw(1000);
        
        System.out.println("Account 1 Final Balance: " + account1.checkBalance());
        

        // Using the constructor with initial balance argument
        Account account2 = new Account(1000);
        
        System.out.println("Account 2 Initial Balance: " + account2.checkBalance());
        
        account2.deposit(3000);
        
        account2.withdraw(1500);
        
        System.out.println("Account 2 Final Balance: " + account2.checkBalance());
        
    }
}
