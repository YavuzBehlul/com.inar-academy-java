package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("***Dispaly Patterns***\nEnter the number of rows to print: ");
		int userRows = input.nextInt();

		displayPattern(userRows);
		input.close();

	}

	public static void displayPattern(int n) {

		for (int row = 1; row <= n; row++) {

			for (int space = n - row; space >= 1; space--) {
				System.out.print("    ");
			}

			for (int i = row; i > 0; i--) {
				System.out.printf("%4d", i);
			}
			System.out.println();

		}

	}
}