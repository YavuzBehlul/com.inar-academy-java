package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter (3 x 3) matrix1: ");

        double[][] matrix1 = new double[3][3];

        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1[i].length; j++) {

                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.println("Enter (3 x 3) matrix2: ");

        double[][] matrix2 = new double[3][3];

        for (int i = 0; i < matrix2.length; i++) {

            for (int j = 0; j < matrix2[i].length; j++) {

                matrix2[i][j] = input.nextDouble();
            }
        }
        double[][] newMatrix = addMatrix(matrix1, matrix2);

        System.out.println("The matrices ae added as flows: ");

        for (int i = 0; i < matrix1.length; i++) {


            for (int j = 0; j < matrix1[i].length; j++) {

                System.out.print(matrix1[i][j] + " ");
                if (i == 1 && j == 2) {
                    System.out.print(" +   ");
                } else if (i != 1 && j == 2)
                    System.out.print("     ");
            }

            for (int j = 0; j < matrix2[i].length; j++) {

                System.out.print(matrix2[i][j] + " ");
                if (i == 1 && j == 2) {
                    System.out.print(" =   ");
                } else if (i != 1 && j == 2)
                    System.out.print("     ");
            }

            for (int j = 0; j < newMatrix[i].length; j++) {

                System.out.print(newMatrix[i][j] + " ");
                if (i != 1 && j == 2)
                    System.out.print("    ");
            }
            System.out.println();

        }

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {

        double[][] sum = new double[3][3];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        return sum;
    }
}
