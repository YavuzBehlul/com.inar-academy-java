package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array:");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] array = createArray(row, column, input);
        int[] largestElementIndex = locateLargest(array);

        System.out.println("The location of the largest element is at (" + largestElementIndex[0] + ", " + largestElementIndex[1] + ")");
    }

    public static double[][] createArray(int row, int column, Scanner input) {
        double[][] result = new double[row][column];
        System.out.print("Enter the array: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }
        return result;
    }


    public static int[] locateLargest(double[][] a) { // result = { rowIndex, columnIndex }
        int[] result = new int[2];
        double max = Double.MIN_VALUE;

        result[0] = -1;
        result[1] = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max <= a[i][j]) {
                    max = a[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
}
