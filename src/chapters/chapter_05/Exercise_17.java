package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of lines: ");

		int linesNumber = input.nextInt();

		for (int i = 0; i <= linesNumber; i++) {
			
			int shiftNumber = linesNumber - i;
			
			for (int k = 0; k < shiftNumber; k++) {
				System.out.print("   ");
			}
			for (int leftNumbers = i; leftNumbers > 1; leftNumbers--) {
				System.out.printf("%3d", (leftNumbers));
			}
			for (int rightNumbers = 0; rightNumbers < i; rightNumbers++) {
				System.out.printf("%3d", (rightNumbers + 1));
			}
			System.out.println();
		}
		input.close();
	}

}
