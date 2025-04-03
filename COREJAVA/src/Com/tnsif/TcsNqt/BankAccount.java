package Com.tnsif.TcsNqt;
	// BankAccount class demonstrating Encapsulation and OOP principles
	class BankAccount {
	    // Private variable to store balance
	    private double balance;

	    // Constructor to initialize balance
	    public BankAccount(double initialBalance) {
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            System.out.println("Initial balance cannot be negative.");
	            this.balance = 0;
	        }
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Method to withdraw money (if sufficient balance)
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance!");
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }

	    // Method to display balance
	    public double getBalance() {
	        return balance;
	    }

	    // Main method to test the BankAccount class
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000); // Creating an account with $1000

	        account.deposit(500); // Depositing $500
	        account.withdraw(200); // Withdrawing $200
	        account.withdraw(1500); // Attempting to withdraw $1500 (should fail)

	        System.out.println("Current Balance: $" + account.getBalance()); // Displaying balance
	    }
	}


