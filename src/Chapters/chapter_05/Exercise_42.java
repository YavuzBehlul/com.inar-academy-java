package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_42 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the commission desired: ");
		double salaryGoal = input.nextDouble();

		double sales = 0.01;

		for (double salaryCurrent = 5_000; salaryCurrent < salaryGoal; sales += 100) {

			if (sales < 5_000) {
				salaryCurrent += (100 * (8.0 / 100));
			} else if (sales < 10_000) {
				salaryCurrent += (100 * (10.0 / 100));
			} else {
				salaryCurrent += (100 * (12.0 / 100));
			}

		}
		System.out.printf("You have to sell $" + sales + " item to earn " + salaryGoal);
		input.close();

	}

}
