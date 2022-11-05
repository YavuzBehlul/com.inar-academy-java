package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = createMatrix(3, input);
        double[][] sortedColumnMatrix = sortColumn(matrix);

        System.out.println("Matrix: ");
        display(matrix);
        System.out.println("-----------\nSorted Row Matrix: ");
        display(sortedColumnMatrix);
    }

    private static double[][] createMatrix(int size, Scanner input) {
        double[][] result = new double[size][size];

        System.out.println("Enter values: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();
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

    public static double[][] sortColumn(double[][] matrix) {
        double[][] result = copy(matrix);
        copySortColumn(result);
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

    public static void copySortColumn(double[][] matrix) {

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                    double currentMin = matrix[j][i];
                    int currentIndex = j;

                    for (int k = j + 1; k <matrix.length ; k++) {
                        if(currentMin > matrix[k][i]){
                            currentMin = matrix[k][i];
                            currentIndex = k;
                        }
                    }
                    if(currentIndex != j){
                        matrix[currentIndex][i] = matrix[j][i];
                        matrix[j][i] = currentMin;
                    }
            }
        }
    }
}
