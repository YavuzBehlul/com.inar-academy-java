package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix1 = new double[3][3];

        System.out.println("Enter the (3 x 3) matrix1: ");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

                matrix1[i][j] = input.nextDouble();
            }
        }

        double[][] matrix2 = new double[3][3];

        System.out.println("Enter the (3 x 3) matrix: ");

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {

                matrix2[i][j] = input.nextDouble();

            }
        }

        double[][] newMatrix = multiplyMatrix(matrix1, matrix2);

        System.out.println("The multiplication of the matrices is:");

        for (int i = 0; i < matrix1.length; i++) {


            for (int j = 0; j < matrix1[i].length; j++) {

                System.out.print(matrix1[i][j] + " ");
                if (i == 1 && j == 2) {
                    System.out.print(" *  ");
                } else if (i != 1 && j == 2) {
                    System.out.print("    ");
                }
            }

            for (int j = 0; j < matrix2[i].length; j++) {

                System.out.print(matrix2[i][j] + " ");
                if (i == 1 && j == 2) {
                    System.out.print(" =  ");
                } else if (i != 1 && j == 2) {
                    System.out.print("    ");
                }
            }

            for (int j = 0; j < newMatrix[i].length; j++) {

                System.out.print(newMatrix[i][j] + " ");
                if (i != 1 && j == 2) {
                    System.out.print("    ");
                }


            }
            System.out.println();
        }

    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {

        double[][] result = new double[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int z = 0; z < a.length; z++) {

                    result[i][j] += a[i][z] * b[z][j];
                }
            }
        }
        return result;
    }
}
