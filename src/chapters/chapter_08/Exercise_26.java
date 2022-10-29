package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = input.nextInt();

        double[][] matrix = createMatrix(size, input);
        double[][] sortedRowMatrix = sortRow(matrix);

        System.out.println("Matrix: ");
        display(matrix);
        System.out.println("-----------\nSorted Row Matrix: ");
        display(sortedRowMatrix);
    }

    public static double[][] createMatrix(int size, Scanner input) {
        double[][] result = new double[size][size];
        System.out.println("Enter values --> ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }
        return result;
    }

    public static double[][] sortRow(double[][] matrix) {
        double[][] result = copy(matrix);
        copySortRow(result);
        return result;
    }

    public static double[][] copy(double[][] matrix) {
        double[][] result = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix[i][j];
            }
        }
        return result;
    }

    public static void copySortRow(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            sortRow(matrix[i]);
        }
    }

    public static void sortRow(double[] row) {
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = i + 1; j < row.length; j++) {
                if ((row[i] > row[j])) {
                    double temp = row[i];
                    row[i] = row[j];
                    row[j] = temp;
                }

            }
        }
    }

    public static void display(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
