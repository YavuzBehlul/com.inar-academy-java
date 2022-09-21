package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double number1, number2, number3;	
		
		System.out.println("(Sort three numbers)\n Enter three numbers: ");
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		number3 = input.nextDouble();

		displaySortedNumbers(number1, number2, number3);
		input.close();

	}

	public static void displaySortedNumbers(double number1, double number2, double number3) {
		double temp;

		if (number1 > number2) {
			temp = number2;
			number2 = number1;
			number1 = temp;
		} else if (number2 > number3) {
			temp = number3;
			number3 = number2;
			number2 = temp;

		}
		System.out.println(number1 + " " + number2 + " " + number3);
	}
}
