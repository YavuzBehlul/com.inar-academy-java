package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numberS = new double[10];

		System.out.print("Enter 10 numbers: ");

		for (int i = 0; i < numberS.length; i++) {
			numberS[i] = input.nextDouble();
		}
		input.close();

		System.out.printf("The mean is %.2f \n", mean(numberS));
		System.out.printf("The standard deviation is %.5f", deviation(numberS));

	}

	public static double deviation(double[] x) {
		double divede = 0.0;
		double dividing = x.length - 1;
		
		for (double nums : x) {
			divede += Math.pow((nums - mean(x)), 2);
		}
		return Math.sqrt((divede / dividing));

	}

	public static double mean(double[] x) {
		double sum = 0;
		double count = x.length;
		
		for (double nums : x) {
			sum += nums;
		}
		return sum / count;

	}
}
