package chapters.chapter_11.exercise_03;

import chapters.chapter_09.exercise_07.Account;

public class SavingsAccount extends Account {
    public SavingsAccount() {

    }
    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if(amount > super.getBalance()) {
            System.out.println("Your balance is: " + super.getBalance() + "$" + "\n" +
                    "You can withdraw only: " + super.getBalance() + "$");
            return;
        }
        super.setBalance(super.getBalance() - amount);
    }

    @Override
    public String toString() {
        return "This is a Saving Account" +
                "\n------------------------" +
                "\nId --> " + super.getId() +
                "\nBalance --> " + super.getBalance() +
                "\nDateCreated --> " + getDateCreated();
    }
}
