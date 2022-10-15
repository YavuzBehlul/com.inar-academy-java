package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.println("Enter the number of sides: ");
        int numberSides = input.nextInt();
        
        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        input.close();
        
        System.out.println("The area of the polygon is " + area(numberSides, side));
    }

    public static double area(int numberSides, double side) {
    	
        return (numberSides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberSides));

	}

}
