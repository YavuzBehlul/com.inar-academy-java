package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn = input.nextLine();

		if (isbn.length() != 12) {
			System.out.println("Invalid input " + isbn + " input MUST be exactly 12 numbers");
			System.exit(0);
		}

		int control = 0;
		for (int i = 0; i < isbn.length(); i++) {

			int value = Integer.parseInt(String.valueOf(isbn.charAt(i)));
			
			control += i % 2 == 0 ? 3 * value : value;
		}
		
		control = 10 - control % 10;

		System.out.println("ISBN-13 number is " + isbn + (control == 10 ? 0 : control));

		input.close();
	}
}