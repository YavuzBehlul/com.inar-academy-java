package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix1:");
        double[][] matrix1 = createMatrix();
        System.out.println("Enter the matrix2:");
        double[][] matrix2 = createMatrix();

        display(matrix1);
        System.out.println("-------------");
        display(matrix2);

        if (equals(matrix1, matrix2)) {
            System.out.println("matrix 1 and matrix2 are strictly identical");
        } else {
            System.out.println("matrix 1 and matrix2 are not strictly identical");
        }
    }

    public static double[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] result = new double[3][3];
        System.out.println("Enter values -->");
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = input.nextInt();
            }
        }
        return result;
    }

    public static void display(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean equals(double[][] matrix1, double[][] matrix2) {

        if(matrix1.length != matrix2.length) {
            return false;
        }

        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                return false;
            }
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
