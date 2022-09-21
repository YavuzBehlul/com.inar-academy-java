package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.println("Number of years: ");
		int numYears = input.nextInt();

		System.out.println("Annual Interest Rate: ");
		double rate = input.nextDouble();

		// Monthly interest rate 
		double monthlyInterestRate = rate / 1200;

		// Monthly payment
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numYears * 12));
		
		System.out.printf("Monthly Payment: %.2f", monthlyPayment);

		double totalPayment = monthlyPayment * numYears * 12;

		System.out.printf("\nTotal Payment: %.2f", totalPayment);
		System.out.println();
		System.out.println("\nPayment#        Interest        Principal       Balance");
		
		double balance = totalPayment;
		double principal;
		double interest;
		for (int i = 1; i <= numYears * 12; i++) {

			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%1d\t%13.2f\t%14.2f\t%15.2f", i, interest, principal, balance);
			System.out.println();
		}

		input.close();
	}

}
