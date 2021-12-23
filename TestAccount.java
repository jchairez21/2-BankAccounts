public class TestAccount {
    public static void main(String[] args) {

        BankAccount person1 = new BankAccount();
        person1.depositCheckings(2.50);
        person1.depositCheckings(100.50);
        person1.depositSavings(250.60);
        // person1.displayBalance();
        //--------

        person1.checkingWithdral(50.50);
        person1.savingsWithdral(100.25);

        person1.displayBalance();
        // person1.setSavingsBalance(1000); //<- wont allow


    }
}