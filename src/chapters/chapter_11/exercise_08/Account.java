package chapters.chapter_11.exercise_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;

    private Date dateCreated = new Date();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account() {
        this(null, 0, 0, 0);
    }

    public Account(int id, double balance, double annualInterestRate) {
        this(null, id, balance, annualInterestRate);
    }

    public Account(String name, int id, double balance, double annualInterestRate) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }


    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Balance : " + this.balance);
            System.out.println("The amount you can withdraw at most : " + this.balance);
            return;
        }
        this.balance -= amount;
        transactions.add(new Transaction(Transaction.WITHDRAW, amount, balance));
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction(Transaction.DEPOSIT, amount, balance));
    }

    @Override
    public String toString() {
        return "Name : " + this.name +
                "\nID : " + this.id +
                "\nBalance : " + this.balance;

    }
}
