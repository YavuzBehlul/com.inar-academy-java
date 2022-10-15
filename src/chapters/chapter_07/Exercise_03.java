package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the integer between 1 and 100: input ends with 0.");
		int[] numberS = new int[1000];
		int number = input.nextInt();
		int count = 0;

		while (number != 0 && number >= 1 && number <= 100) {

			number = input.nextInt();
			numberS[count] = number;
			count++;
		}
		countNumbers(numberS);
		input.close();

	}

	public static void countNumbers(int[] numberS) {
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 0; j < numberS.length - 1; j++) {
				if (numberS[j] == i) {
					count += 1;
				}
			}
			if (count != 0) {
				System.out.printf("%-2d occurs %-2d time(s) \n", i, count);
			}
		}

	}

}
