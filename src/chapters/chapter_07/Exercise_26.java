package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter length of list: ");
		int length = input.nextInt();
		
		System.out.println("Enter list1: ");
		int[] list1 = new int[length];

		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.println("Enter list2: ");		
		int[] list2 = new int[length];

		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		input.close();

		if (equals(list1, list2)) {
			System.out.println("The lists are strictly identical");
		} else {
			System.out.println("The lists are not strictly identical");
		}

	}

	public static boolean equals(int[] list1, int[] list2) {

		boolean equalFlag = true;

		for (int i = 0; i < list1.length; i++) {

			if (list1[i] != list2[i])
				equalFlag = false;

		}
		return equalFlag;

	}
}
