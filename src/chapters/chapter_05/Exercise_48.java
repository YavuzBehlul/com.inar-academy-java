package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String result = "";

		System.out.print("Enter a string: ");
		String userStr = input.nextLine();
		
		userStr = "A" + userStr; // index 0 :D

		for (int i = 0; i < userStr.length(); i++) {

			switch (i % 2) {
			case 0:
				break;
			default:
				result += userStr.charAt(i);
				break;
			}

		}
		input.close();
		System.out.println(result);

	}

}
