package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer for sum the digits: ");
		long number = input.nextLong();
		System.out.println(sumDigits(number));
		input.close();
	}

	public static int sumDigits(long n) {
		int summed = 0;
		int num1 = (int) (n);

		while (num1 != 0) {
			summed += (num1 % 10);
			num1 = num1 / 10;
		}
		return summed;

	}

}
