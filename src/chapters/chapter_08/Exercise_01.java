package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] arr = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for(int i = 0; i < arr.length; i++ ) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < 4; i++) {
        System.out.println("The sum of the elements at column " +i+ " is " + sumColumn(arr,i));
        }

        input.close();
    }
    public static double sumColumn(double[][] m, int columnIndex) {

        double sum = 0;

        for( int i = 0; i < m.length; i++) {

            sum += m[i][columnIndex];
        }
        return sum;

    }
}
