package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("***Phone Keypads***\nEnter a string: ");
		String number = input.next();
		input.close();
		
		String result = "";
		for (int i = 0; i < number.length(); i++) {

			if (Character.isLetter(number.charAt(i))) {

				result += getNumber(number.charAt(i));

			} else {
				result += String.valueOf(number.charAt(i));
			}
		}
		System.out.println(result);

	}

	public static int getNumber(char chr) {

		String letter = String.valueOf(chr).toLowerCase();

		if ("abc".contains(letter)) {
			return 2;

		} else if ("def".contains(letter)) {
			return 3;

		} else if ("ghi".contains(letter)) {
			return 4;

		} else if ("jkl".contains(letter)) {
			return 5;

		} else if ("mno".contains(letter)) {
			return 6;

		} else if ("pqrs".contains(letter)) {
			return 7;

		} else if ("tuv".contains(letter)) {
			return 8;

		} else if ("wxyz".contains(letter)) {
			return 9;

		}
		return 0;
	}
}
