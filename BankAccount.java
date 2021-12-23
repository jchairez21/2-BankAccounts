public class BankAccount {

    //  member variables -----------
    private double checkingBalance;
    private double savingsBalance;
// When we create static variables, it is common practice to create static methods to access the said variables.⬇
    private static int numberOfAccounts = 0;
    private static double accountTotalAmount = 0;

    //  constructor ---------------
    public BankAccount() {
        numberOfAccounts++;
    }
    //  methods --------------------
// Accessing private static variable.⬇
    public static int numberOfAccounts() {
// Static methods can only call OTHER Static Methods!
        return numberOfAccounts;
    }
    public static double accountTotalAmount() {
        return accountTotalAmount;
    }

//-- Deposit --
    public void depositCheckings(double money) {
        setCheckingBalance(getCheckingBalance() + money);
        this.accountTotalAmount += money;
    }
    public void depositSavings(double money) {
        setSavingsBalance(getSavingsBalance() + money);
        this.accountTotalAmount += money;
    }

//-- Withdrawl --
    public void checkingWithdral(double money) {
        if(getCheckingBalance() < money) {
            System.out.println("Can not make transaction. \n Insufficient amount of funds!");
        }
        else {
            this.checkingBalance -= money;
            this.accountTotalAmount -= money;
        }
    }

    public void savingsWithdral(double money) {
        if(getSavingsBalance() < money) {
            System.out.println("Can not make transaction. Insufficient amount of funds!");
        }
        else {
            this.savingsBalance -= money;
            this.accountTotalAmount -= money;
        }
    }

//-- Display --
    public void displayBalance() {
		System.out.println("Checkings Balance: " + getCheckingBalance());
		System.out.println("Savings Balance: " + getSavingsBalance());
		System.out.println("Total Balance: " + accountTotalAmount());
	}
    //  getters and setters --------
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    private void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    private void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }



}
