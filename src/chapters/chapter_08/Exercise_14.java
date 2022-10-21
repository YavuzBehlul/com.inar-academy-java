package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] array = createRandomArray(size);
        display(array);
        System.out.println();

        printSameRows(array);
        printSameColumns(array);
        printSameMajorDiagonal(array);
        printSubDiagonal(array);
    }

    public static int[][] createRandomArray(int size) {
        int[][] result = new int[size][size];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 2);
            }
        }

        return result;
    }

    public static void display(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }


    public static void printSameRows(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isSameRow = true;
            int number = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (number != array[i][j]) {
                    isSameRow = false;
                }
            }
            if (isSameRow) {
                System.out.println("All " + number + " s on row " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No same numbers on a row");
        }
    }

    public static void printSameColumns(int[][] array) {
        int count = 0;
        for (int i = 0; i < array[0].length; i++) {
            boolean isSameColumn = true;
            int number = array[0][i];
            for (int j = 1; j < array.length; j++) {
                if (number != array[j][i]) {
                    isSameColumn = false;
                }
            }
            if (isSameColumn) {
                System.out.println("All " + number + "s on column " + i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No same numbers on a column");
        }
    }

    public static void printSameMajorDiagonal(int[][] array) {
        int number = array[0][0];
        boolean isSameMajorDiagonal = true;
        for (int i = 1; i < array.length; i++) {
            if (number != array[i][i]) {
                isSameMajorDiagonal = false;
            }
        }

        if (isSameMajorDiagonal) {
            System.out.println("All " + number + " s on major diagonal");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }
    }

    public static void printSubDiagonal(int[][] array) {
        int number = array[0][array[0].length - 1];
        boolean isSameSubdiagonal = true;
        for (int i = 1, j = array[0].length - 2; i < array.length; i++, j--) {
            if (number != array[i][j]) {
                isSameSubdiagonal = false;
            }
        }
        if (isSameSubdiagonal) {
            System.out.println("All " + number + "s on sub-diagonal");
        } else {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }
}
