package chapters.chapter_12.exercise_04;

public class Loan {
    private static int numberOfLoanObject = 0;
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) {

        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
        loanDate = new java.util.Date();
        numberOfLoanObject++;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate)
            throws IllegalArgumentException {

        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException(
                    "Illegal annual interest rate: " + annualInterestRate);
        }
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears)
            throws IllegalArgumentException {

        if (numberOfYears <= 0) {
            throw new IllegalArgumentException(
                    "Illegal number of years: " + numberOfYears);
        }
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount)
            throws IllegalArgumentException {
        if (loanAmount <= 0) {
            throw new IllegalArgumentException(
                    "Illegal annual interest rate: " + annualInterestRate);
        }
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }
    public String toString() {
        String str = String.format("Loan Amount: %.2f\nTotal Amount %.2f",
                this.loanAmount, this.getTotalPayment());
        return str;
    }
}
