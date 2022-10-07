package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String stringLine = input.nextLine();

		for (int i = stringLine.length() ; i > 0 ; i--) {

			System.out.print(stringLine.charAt(i-1));

		}
		input.close();

	}

}
