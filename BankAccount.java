public class BankAccount {
    // Instance variables
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    
    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    // Public method to access balance
    public double getBalance() {
        return balance;
    }
    
    // Public method to modify balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass demonstrating protected and public member access
class SavingsAccount extends BankAccount {
    private double interestRate;
    
    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    
    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("987654321", "Alice", 5000.00, 2.5);
        savings.displayAccountDetails();
        savings.displaySavingsAccountDetails();
    }
}
