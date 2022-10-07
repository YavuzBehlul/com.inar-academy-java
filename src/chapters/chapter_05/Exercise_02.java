package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***Repeat Additions***");
		
		int numberOfQuestion = 10;
		long timeOfStart = System.currentTimeMillis();

		int counter = 0;
		int counterOfTrue = 0;

		while (counter < numberOfQuestion) {
			int number1 = (int) (1 + Math.random() * 15);
			int number2 = (int) (1 + Math.random() * 15);

			System.out.println(number1 + " + " + number2 + " =?");
			int answer = input.nextInt();

			if (number1 + number2 == answer) {
				System.out.println("The answer is correct.");
				counterOfTrue++;

			} else {
				System.out.println("The answer is wrong.");

			}
			counter++;
		}
		input.close();
		long timeOfFinish = System.currentTimeMillis();
		int span = (int) ((timeOfFinish - timeOfStart) / 1000);

		System.out.println("\nTotal time: " + span + " second.");
		System.out.println(counter + " questions were asked.");
		System.out.println(counterOfTrue + " correct answer was given.");

		

	}

}
