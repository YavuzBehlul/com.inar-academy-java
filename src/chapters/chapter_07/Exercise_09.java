package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] arr = new double[10];

		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextDouble();
		}
		System.out.println("The minimum number is: " + min(arr));
		input.close();

	}

	public static double min(double[] array) {

		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			min = Math.min(min, array[i]);
		}
		return min;
	}
}
