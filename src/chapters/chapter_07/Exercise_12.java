package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {

		System.out.println("Enter 10 numbers: ");
		Scanner input = new Scanner(System.in);
		int[] numberS = new int[10];

		for (int i = 0; i < 10; i++) {
			numberS[i] = input.nextInt();
		}
		input.close();
		
		reverseArray(numberS);
		
		System.out.println("Your array reversed is: " );
		
		for(int e: numberS) {
			System.out.print(e);
			
		}
	}

	public static int[] reverseArray(int[] array) {

		int index = array.length - 1;
		for (int i = 0; i < array.length / 2; i++) {

			int tmp = array[i];
			array[i] = array[index];
			array[index] = tmp;
			index--;
		}
		return array;
	}
}
