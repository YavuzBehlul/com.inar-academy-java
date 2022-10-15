package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] valueS = new double[10];

		System.out.println("Enter ten double value: ");

		for (int i = 0; i < 10; i++) {
			valueS[i] = input.nextDouble();

		}
		input.close();

		System.out.println(average(valueS));

	}

	public static int average(int[] array) {
		int arr = array.length;
		int sum = 0;

		for (int i = 0; i < arr; i++) {
			sum += array[i];
		}

		return sum / arr;
	}

	public static double average(double[] array) {

		int arr = array.length;
		double sum = 0;
		for (int i = 0; i < arr; i++) {
			sum += array[i];

		}

		return sum / arr;

	}
}
