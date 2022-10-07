package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = input.nextInt();

		printMatrix(n);
		input.close();

	}

	public static void printMatrix(int n) {

		for (int i = n; i > 0; i--) {
			
			for (int j = n; j > 0; j--) {
				System.out.print((int) (Math.random() * 2) + " ");
			}
			System.out.println();

		}
	}
}
