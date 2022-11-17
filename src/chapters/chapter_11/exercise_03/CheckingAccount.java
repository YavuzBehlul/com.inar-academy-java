package chapters.chapter_11.exercise_03;


import chapters.chapter_09.exercise_07.Account;

public class CheckingAccount extends Account {
    public static final double OVERDRAFT_LIMIT = -3000;
    public CheckingAccount() {}
    public CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if(super.getBalance() - amount < CheckingAccount.OVERDRAFT_LIMIT) {
            System.out.println("Your balance is --> " + super.getBalance() + "$" + "\n" +
                    "You can withdraw only --> " + (super.getBalance() - CheckingAccount.OVERDRAFT_LIMIT) + "$");
            return;
        }
        super.setBalance(super.getBalance() - amount);
    }

    @Override
    public String toString() {
        return "This is a Checking Account " +
                "\n--------------------------" +
                "\nId --> " + super.getId() +
                "\nBalance --> " + super.getBalance() +
                "\nDateCreated --> " + getDateCreated();
    }
}
