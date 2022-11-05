package chapters.chapter_09.exercise_13;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = getFromUser(input);
        Location loc = locateLargest(matrix);
        System.out.println(loc.toString());
    }

    public static Location locateLargest(double[][] m) {

        int row = -1;
        int col = -1;
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maxValue) {
                    row = i;
                    col = j;
                    maxValue = m[i][j];
                }
            }
        }

        return new Location(row, col, maxValue);
    }


    public static double[][] getFromUser(Scanner input) {
        System.out.println("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int col = input.nextInt();

        double[][] m = new double[row][col];

        System.out.println("Enter array: ");
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                m[r][c] = input.nextDouble();
            }
        }

        return m;
    }

}
