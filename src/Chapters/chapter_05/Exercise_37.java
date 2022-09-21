package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal integer: ");
		int decimalNumber = input.nextInt();

		String binaryString = "";
		for (int i = decimalNumber; i > 0; i /= 2) {
			if (i % 2 == 0) {
				binaryString = "0" + binaryString;
			} else {
				binaryString = "1" + binaryString;
			}
		}
		System.out.println("Decimal integer: " + decimalNumber + " equals to binary number: " + binaryString);

		input.close();

	}

}
