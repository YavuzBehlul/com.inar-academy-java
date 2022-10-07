package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN-10 number: ");
		String numberName = "";
		int dividing = 0;
		for (int i = 0; i < 9; i++) {
			
			int number = input.nextInt();
			numberName +=  "" + number +"";
			dividing += number * i;
			
		}

		int result = dividing % 11;

		if (result == 10) {
			System.out.println("The ISBN-10 number is: " + numberName + "X");
		} else {
			System.out.println("The ISBN-10 number is: " + numberName + result);
		}

		input.close();
	}

}
