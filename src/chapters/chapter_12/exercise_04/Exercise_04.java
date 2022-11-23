package chapters.chapter_12.exercise_04;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Enter annual interest rate: ");
            double interestRate = input.nextDouble();

            System.out.println("Enter numbers of years: ");
            int numberOfYears = input.nextInt();

            System.out.println("Enter loan amount: ");
            double loanAmount = input.nextDouble();

            try{
                Loan ml1 = new Loan(interestRate, numberOfYears,loanAmount);
                System.out.println(ml1.getTotalPayment());
                break;

            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage()+ "\n--------------------------");
                StackTraceElement[] stackTraceElements = ex.getStackTrace();
                for (int i = 0; i < stackTraceElements.length; i++) {
                    System.out.println(stackTraceElements[i]);

                }
                System.out.println("-------------------------");
            }
        }

    }
}
