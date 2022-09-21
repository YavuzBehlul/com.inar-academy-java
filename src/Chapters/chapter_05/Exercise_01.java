package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		double total = 0;
		int positive = 0;
		int negative = 0;

		Scanner input = new Scanner(System.in);

		System.out.println(
				"***Count Positive and Negative Number and Compute the Average of Number***\n Enter an integer:\n(end==0): ");
		int number = input.nextInt();
		
		if (number == 0) {
			System.out.println("No numbers entered except 0");
			System.exit(1);
		}

		int count = 0;

		while (number != 0) {

			total += number;
			count++;

			if (number > 0) {
				positive++;
			}
			if (number < 0) {
				negative++;
			}

			number = input.nextInt();
		}

		double average = total / count;

		System.out.println("The number of positives is: " + positive);
		System.out.println("The number of negatives is: " + negative);
		System.out.println("The total is: " + total);
		System.out.println("The average is: " + average);

		input.close();

	}

}
