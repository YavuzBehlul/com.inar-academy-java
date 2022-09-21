package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int firstYear = 1;
		int lastYear = 30;
		
		System.out.println("Enter the amount invested: ");
		double amount = input.nextDouble();

		System.out.println("The Annual interest rate:  ");
		double yearRate = input.nextDouble();
		
		yearRate /= 100;
		double monthRate = yearRate / 12;

		System.out.println("Years     Future Value ");

		for (int i = firstYear; i <= lastYear; i++) {
			System.out.printf("%-4d",i);
			System.out.printf("%15.2f", futureInvestmentValue(amount, monthRate, i));
			System.out.println();
		}

		input.close();

	}
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
