package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three points for a triangle: ");		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();								
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		input.close();
		
		double s1 = findSide(x1, y1, x2, y2);
		double s2 = findSide(x2, y2, x3, y3);
		double s3 = findSide(x1, y1, x3, y3);

		if (isValid(s1, s2, s3)) {
			System.out.println("The area of the triangle is: " + area(s1, s2, s3));
		} else {
			System.out.println("The input is invalid.");
		}

	}

	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;

		return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
	}

	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1 + side2) < side3) {
			return false;
		} else if ((side1 + side3) < side2) {
			return false;
		} else if ((side2 + side3) < side1) {
			return false;
		} else {
			return true;
		}
	}

	public static double findSide(double x1, double y1, double x2, double y2) {

		return Math.pow(Math.pow(x1 - x2, 2) + Math.pow((y1 - y2), 2), 0.5);
	}
}
