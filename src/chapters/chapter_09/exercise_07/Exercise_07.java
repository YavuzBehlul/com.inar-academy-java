package chapters.chapter_09.exercise_07;

public class Exercise_07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("\n          Account Statement");
        System.out.println("------------------------------------------");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: " + account.getBalance() +
                "\nMonthlyInterest: " + account.getMonthlyInterest() +
                "\nDateCreated: " + account.getDateCreated());
        System.out.println("------------------------------------------");
    }
}
