package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		
		System.out.print("Enter ten numbers: ");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		input.close();

		getBubbleSorted(numbers);

		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
	}

	public static void getBubbleSorted(double[] numbers) {
		double temp;
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;

				}
			}
		}

	}

}
