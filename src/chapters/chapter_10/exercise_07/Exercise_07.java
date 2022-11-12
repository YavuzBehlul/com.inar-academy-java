package chapters.chapter_10.exercise_07;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];

        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100, 10);
        }

        while (true) {

            System.out.print("Enter an ID : ");
            int id = input.nextInt();

            while (!isValidId(id, accounts)) {
                System.out.println("Invalid Id.Re-enter your id :");
                id = input.nextInt();
            }

            int choice = -1;
            while (choice != 4) {
                displayMenu();
                askChoice();
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        displayBalance(accounts[id]);
                        break;
                    case 2:
                        withDrawProcess(accounts[id], input);
                        break;
                    case 3:
                        depositProcess(accounts[id], input);
                        break;
                    case 4:
                        break;
                    default:
                        do {
                            System.out.println("Invalid choice please enter a number between 1 - 4 : ");
                            choice = input.nextInt();
                        } while (choice > 4 || choice <= 0);
                }
            }
        }


    }

    public static boolean isValidId(int id, Account[] accounts) {
        return accounts.length > id && id >= 0;
    }

    public static void displayMenu() {
        System.out.println("Main menu\n" + "1: check balance\n" +
                "2: withdraw\n" + "3: deposit\n" + "4: exit");
    }

    public static void askChoice() {
        System.out.print("Enter a choice:");
    }

    public static void withDrawProcess(Account account, Scanner input) {

        System.out.print("Enter an amount to withdraw:");
        double amount = input.nextDouble();
        while (0 > amount || amount > account.getBalance()) {
            if (amount < 0) {
                System.out.println("Invalid input.Re-enter an amount to withdraw :");
            } else {
                System.out.println("You don't have $" + amount
                        + " in your account.Your balance is $" + account.getBalance()
                        + ".Enter a reasonable amount :");
            }
            amount = input.nextDouble();
        }
        account.withdraw(amount);
    }

    public static void depositProcess(Account account, Scanner input) {
        System.out.print("Enter an amount to deposit:");
        double amount = input.nextDouble();

        while (0 > amount) {
            System.out.println("Invalid input.Re- enter an amount to deposit :");
            amount = input.nextDouble();
        }

        account.deposit(amount);
    }

    public static void displayBalance(Account account) {
        System.out.println("The balance is " + account.getBalance());
    }
}
