package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount to invest: ");
		double investment = input.nextDouble();

		System.out.print("Enter the annual interest rate: ");
		double interestRate = input.nextDouble();

		interestRate = interestRate / 100;

		System.out.println("Enter the number of months: ");
		int numberOfMonths = input.nextInt();

		double total = 0;

		for (int i = 1; i <= numberOfMonths; i++) {

			total = (investment + total) * (1 + (interestRate / 12));

		}

		System.out.println("After the " + numberOfMonths + " months, the total payment  is " + total);
		input.close();
	}

}
