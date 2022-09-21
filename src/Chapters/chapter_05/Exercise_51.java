package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_51 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("***Longest Common Prefix***\nEnter string one: ");
		String str1 = input.nextLine();
		int length_1 = str1.length();
		
		System.out.println("Enter string two: ");		
		String str2 = input.nextLine();
		int length_2 = str2.length();

		if (str1.charAt(0) != str2.charAt(0)) {

			System.out.println(str1 + " and " + str2 + " have no common prefix ");

		} else {
			
			int prefix = 0;
			
			for (int i = 0; i < (Math.min(length_1, length_2)); i++) {  //java.lang.StringIndexOutOfBoundsException

				if (str1.charAt(i) == str2.charAt(i)) {
					prefix = i;
				} else {
					break;
				}
			}
			System.out.print("The common prefix is: " + str1.substring(0, prefix + 1));

		}

		input.close();

	}

}
