package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");

		double[] numberS = new double[10];

		for (int i = 0; i < numberS.length; i++) {
			numberS[i] = input.nextDouble();
		}
		input.close();

		System.out.println("Smallest element's value is: " + numberS[indexOfSmallestElement(numberS)]
				+ "\nSmallest element's index is: " + indexOfSmallestElement(numberS));

	}

	public static int indexOfSmallestElement(double[] array) {

		double smallest = array[0];
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (smallest > array[i]) {
				smallest = array[i];
				index = i;
			}

		}
		return index;
	}
}
