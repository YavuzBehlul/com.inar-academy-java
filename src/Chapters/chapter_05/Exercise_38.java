package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal integer: ");
		int decimalNumber = input.nextInt();
		String octalString = ""; 
		for (int i = decimalNumber; i > 0; i /= 8) {
			octalString = (i % 8) + octalString;
		}
		
		System.out.println("Decimal integer: " + decimalNumber + " equals to octal number: " + octalString);
		
		input.close();

	}

}
