package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numberS = new int[5];
		
		System.out.println("Enter 5 numbers to find their GCD: ");

		for (int i = 0; i < numberS.length; i++) {
			numberS[i] = input.nextInt();
		}
		input.close();

		System.out.println("The GCD is " + gcd(numberS));

	}

	public static int gcd(int... numbers) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		int gcd = 1;
		boolean flag;

		for (int i = 2; i <= min; i++) {
			flag = true;
			
			for (int index = 0; index < numbers.length; index++) {
				if (numbers[index] % i != 0)
					flag = false;
			}
			if (flag) {
				gcd = i;
			}
		}
		return gcd;
	}
}
