package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of a matrix: ");
        int size = input.nextInt();

        double[][] matrix = createMatrix(size, input);

        displayMatrix(matrix);

        if (isPositiveMarkovMatrix(matrix)) {
            System.out.println("Matrix is a positive markov matrix.");
        } else {
            System.out.println("Matrix is not a positive markov matrix.");
        }
    }

    public static double[][] createMatrix(int size, Scanner input) {
        System.out.println("Enter the values: ");
        double[][] result = new double[size][size];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }
        return result;
    }

    public static boolean isPositiveMarkovMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] < 0) {
                    return false;
                }
                sum += matrix[j][i];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }

    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
