package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_35 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		input.close();
		
		System.out.println("The area of the pentagon is " + area(side));
	}

	public static double area(double side) {
		return 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));

	}

}
