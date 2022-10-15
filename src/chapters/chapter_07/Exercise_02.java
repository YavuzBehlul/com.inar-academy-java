package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter ten numbers to reverse those: ");
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = input.nextInt();
		}
		displayReverseNumber(arr);
		input.close();
	}

	public static void displayReverseNumber(int[] arr) {
		for (int i = arr.length - 1 ; i >= 0 ; i--) {
			System.out.print(arr[i] + ",");
			
		}
		
	}

}
