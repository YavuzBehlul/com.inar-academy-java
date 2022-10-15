package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int control = 0;
		int counter = 0;
		System.out.println("Enter ten numbers: ");
		
		for(int i = 0; i < 10 ; i++) {
			control = input.nextInt();
			if(distinctNumber(numbers, control)) {
				numbers[counter] = control;
				counter++;
			}
			
		}
		input.close(); 
		System.out.println("The count of distinct number is " + counter);
		toPrintDistinctNumber(numbers);

	}
	public static boolean distinctNumber(int[] numbers, int control) {
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == control) {
				return false;
			}
		}
		return true;
	}
	public static void toPrintDistinctNumber(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] != 0) {
				System.out.print( numbers[i] + " ");
			}
				
			
		}
	}

}
