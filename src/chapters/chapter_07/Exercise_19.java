package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter list lenght: ");
		int lenght = input.nextInt();
		int[] numbers = new int[lenght];
		
		System.out.println("Enter list: ");		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		input.close();

		if (isSorted(numbers)) {
			System.out.println("The list is alread sorted.");

		} else {
			System.out.println("The list is not sorted.");

		}
	}

	public static boolean isSorted(int[] list) {
		boolean flag = true;
		
		for (int i = 1; i < list.length; i++) {
			
			for (int j = 0; j < list.length - i; j++) {
				
				if (list[j] > list[j + 1]) {
					
					flag = false;
					
					return flag;
				}

			}
		}
		return flag;

	}

}
