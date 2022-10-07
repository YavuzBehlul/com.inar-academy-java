package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_49 {

	public static void main(String[] args) {
		final String vowelString = "AEIOU";

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");

		String userStr = input.nextLine().toUpperCase();

		int vowels = 0, consonants = 0;

		for (int i = 0; i < userStr.length(); i++) {

			char chr = userStr.charAt(i);

			if (Character.isLetter(chr)) {
				if (vowelString.contains(String.valueOf(chr))) {
					++vowels;
				} else {
					++consonants;
				}
			}
		}

		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);
		input.close();
	}

}
