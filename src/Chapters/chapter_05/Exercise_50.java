package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("***Count Uppercase Letter***\nEnter a string: ");

		String userStr = input.nextLine();
		int counterUppercase = 0;

		for (int i = 0; i < userStr.length(); i++) {

			if (Character.isUpperCase(userStr.charAt(i))) {
				counterUppercase++;
			}

		}

		System.out.println("The number of upper case letters is: " + counterUppercase);
		input.close();
	}

}
