package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter values for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double[] values = new double[3];
        values[0]= a;
        values[1] = b;
        values[2] = c;
        
        double[] roots = new double[2];

        int rootResult = solveQuadratic(values, roots);
        input.close();
        
        System.out.println("The number of real roots is " + rootResult);
        
        if (rootResult != 0) {
        	
            System.out.print("The real roots values are: ");
            
            for (double value : roots) {
            	
                if (value != 0.0) {
                    System.out.print(value + " ");
                }
            }
        }
        
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {

        double disciriminant = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];

        if (disciriminant < 0) {
        	return 0;
        	
        } else if (disciriminant == 0) {
        	
            roots[0] = (-1 * eqn[1]) + (Math.pow(disciriminant, 0.5) / (2 * eqn[0]));
            return 1;

        } else {
        	
            roots[0] = (-1 * eqn[1]) + (Math.pow(disciriminant, 0.5) / (2 * eqn[0]));
            roots[1] = (-1 * eqn[1]) - (Math.pow(disciriminant, 0.5) / (2 * eqn[0]));
            return 2;
        }


	}

}
