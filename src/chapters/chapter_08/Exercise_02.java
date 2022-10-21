package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] bArr = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row: ");

        for (int row = 0; row < bArr.length; row++) {
            for (int column = 0; column < bArr[row].length; column++) {

                bArr[row][column] = input.nextDouble();
            }
        }
        input.close();
        System.out.println("The sum of the elements " +
                "in the major diagonal is" + ": " + sumMajorDiagonal(bArr));
    }

    public static double sumMajorDiagonal(double[][] m) {

        double sum = 0;
        for (int column = 0; column < m.length; column++) {

            sum += m[column][column];
        }
        return sum;

    }
}
