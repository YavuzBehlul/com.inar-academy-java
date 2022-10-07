package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_16 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int number = in.nextInt();

		for (int i = 2; number / i != 1;) {

			if (number % i == 0) {
				
				System.out.print(i + ",");
				number = number / i;
				
				continue;
				
			} else {
				
				i++;
			}

		}
		
		System.out.print(number + ".");

		in.close();

	}

}
