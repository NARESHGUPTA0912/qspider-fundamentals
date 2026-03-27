// Encapsulation is the concept of hiding data(variables) within a class and allowing access
// only through public methods (getters and setters)

package EncapsulationExample;

class Bank {
    // private variables (data hiding)
    private int accountNumber ;
    private double balance;
    private String accountHolderName;

    // Parametrized Constructor 
    public Bank(int accountNumber, double balance, String accountHolderName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    // getter for account number
    public int getAccountNumber(){
        return accountNumber;
    }

    // setter for account number
    public void setAccountNumber(int accountNumber){
        if(accountNumber > 0){
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number!");
        }
    }

    // getter for balance
    public double getBalance(){
        return balance;
    }

    // setter for balance
    public void setBalance(double balance){
        if(balance >= 0){
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // getter for account holder name
    public String getAccountHolderName(){
        return accountHolderName;
    }

    // setter for account holder name
    public void setAccountHolderName(String accountHolderName){
        if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Account holder name cannot be empty!");
        }
    }

    // private method (can't be accessed outside the class)
    private void internalCheck() {
        System.out.println("Performing internal bank check...");
    }

    // public method to access private method
    public void accessInternalCheck() {
        internalCheck();
        System.out.println("Check complete!");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        
        // Create a Bank Object
        Bank bankAccount = new Bank(19289191, 97009200, "PriNce Gupta");

        // Access through getters
        System.out.println("Account Holder: " + bankAccount.getAccountHolderName());
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: " + bankAccount.getBalance());

        // Modify values using setters 
        bankAccount.setBalance(95008100);
        bankAccount.setAccountHolderName("Prince Gupta");
        System.out.println("\nUpdated Details:");
        System.out.println("Account Holder: " + bankAccount.getAccountHolderName());
        System.out.println("Balance: " + bankAccount.getBalance());

        System.out.println();
        // Invalid data examples
        bankAccount.setAccountHolderName("\n");
        bankAccount.setBalance(-200);
        System.out.println();
        // Access private method through public method
        bankAccount.accessInternalCheck();
    }
}


