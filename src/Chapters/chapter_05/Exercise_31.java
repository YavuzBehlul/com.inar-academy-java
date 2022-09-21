package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the initial deposit amount: ");
		double deposit = input.nextDouble();

		System.out.print("Enter annual percentage yield: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200.0;

		System.out.print("Enter maturity period (number of months): ");
		double numberOfMonths = input.nextInt();

		System.out.print("\nMonths\t\tCD Value\n");
		
		double amountInAccount = deposit;
		
		for (int i = 1; i <= numberOfMonths; i++) {
			
			amountInAccount *= (1.0D + monthlyInterestRate); //sadece aylık olanı degil, aylık totalin anaparaya eklenmesini istiyorum 
			System.out.printf("%5d%20.2f\n", i, amountInAccount);
		}
		input.close();

	}

}
