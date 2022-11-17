package chapters.chapter_11.exercise_08;

import java.util.Date;

public class Transaction {
    public static final char WITHDRAW = 'W';
    public static final char DEPOSIT = 'D';

    private Date date;
    private char typeOfTransaction;
    private double amount;
    private double balance;
    private String description;

    public  Transaction() {
        this(Transaction.DEPOSIT, 0, 0);
    }
    public Transaction(char typeOfTransaction, double amount, double balance) {
        this.typeOfTransaction = typeOfTransaction;
        this.amount = amount;
        this.balance = balance;
        date = new Date();
        this.description = this.getDescripton();
    }

    public String getDescripton() {
        return this.date.toString() + "\n" +  (this.typeOfTransaction == 'W' ? "Withdraw" : "Deposit") + "\n-------------\n"
                + "Amount : "  + this.amount + "\nBalance : " + this.balance;

    }
}
