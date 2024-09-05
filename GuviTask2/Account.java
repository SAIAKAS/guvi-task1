package GuviTask2;

public class Account {
    private double balance;

  
    public Account() {
        this.balance = 0.0;
    }

   
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            this.balance = 0.0;
        }
    }

    // deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    //  withdraw amount
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
// balance
    
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

   
    public static void main(String[] args) {
        // Creating account objects
        Account account1 = new Account(); // Default balance of 0
        Account account2 = new Account(1000); // Initial balance of 1000

       // account1
        account1.deposit(1000);
        account1.withdraw(500);
        account1.displayBalance();

        // account2
        account2.deposit(500);
        account2.withdraw(20000);
        account2.displayBalance();
    }
}


