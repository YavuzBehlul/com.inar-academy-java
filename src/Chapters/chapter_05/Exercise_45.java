package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ten numbers: ");

		double summution = 0;

		for (int i = 0; i < 10; i++) {
			double number = input.nextDouble();

			summution += number;

		}

		double mean = summution / 10.0;

		System.out.println("Please again enter ten numbers: ");
		double dividing = 0;

		for (int i = 0; i < 10; i++) {
			double numRepeat = input.nextDouble();

			dividing += Math.pow((numRepeat - mean), 2);
		}

		double square = Math.pow(dividing,0.5);
		double result = square / (9.0);
		System.out.println(result);
		input.close();
	}

}
