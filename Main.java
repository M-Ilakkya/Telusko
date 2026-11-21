// import java.util.*; // Imports utility classes (Scanner, ArrayList, etc.)

// class BankAccount { // Creates a BankAccount class

//     private String accountHolder; // Stores account holder name (hidden using encapsulation)
//     private double balance; // Stores account balance (hidden using encapsulation)

//     // Constructor
//     public BankAccount(String accountHolder, double balance) { // Initializes object data
//         this.accountHolder = accountHolder; // Assign parameter value to instance variable
//         this.balance = balance; // Assign parameter value to instance variable
//     }

//     // Deposit Method
//     public void deposit(double amount) { // Method to add money
//         if (amount > 0) { // Check if amount is valid
//             balance = balance + amount; // Add amount to balance
//             System.out.println("Deposited: " + amount); // Display deposited amount
//         } else {
//             System.out.println("Invalid Deposit Amount"); // Display error message
//         }
//     }

//     // Withdraw Method
//     public void withdraw(double amount) { // Method to withdraw money
//         if (amount > 0 && amount <= balance) { // Check balance and valid amount
//             balance = balance - amount; // Deduct amount from balance
//             System.out.println("Withdrawn: " + amount); // Display withdrawn amount
//         } else {
//             System.out.println("Insufficient Balance"); // Display error message
//         }
//     }

//     // Getter Method
//     public double getBalance() { // Returns current balance
//         return balance;
//     }

//     public String getAccountHolder() { // Returns account holder name
//         return accountHolder;
//     }
// }

// public class Main { // Main class

//     public static void main(String[] args) { // Program execution starts here

//         BankAccount acc = new BankAccount("John", 5000);
//         // Creates object and calls constructor

//         System.out.println("Account Holder: " + acc.getAccountHolder());
//         // Calls getter method to get account holder name

//         System.out.println("Initial Balance: " + acc.getBalance());
//         // Calls getter method to get current balance

//         acc.deposit(2000);
//         // Calls deposit method

//         acc.withdraw(1000);
//         // Calls withdraw method

//         System.out.println("Final Balance: " + acc.getBalance());
//         // Prints updated balance
//     }
// }
import java.util.*;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(name, balance);

        System.out.println("\nAccount Created Successfully");
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());

        System.out.print("\nEnter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        System.out.print("Enter Withdraw Amount: ");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);

        System.out.println("\nFinal Balance: " + acc.getBalance());

        sc.close();
    }
}