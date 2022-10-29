package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row: ");
        int row = input.nextInt();

        System.out.print("Enter the number of column: ");
        int column = input.nextInt();

        int[][] matrix = createRandomMatrix(row, column);

        displayArray(matrix);
        System.out.println(hasConsecutiveFour(matrix));
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createRandomMatrix(int row, int column) {
        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static String hasConsecutiveFour(int[][] matrix) {
        String result = "";
        boolean hasConsecutiveFour = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (hasConsecutiveFourInRow(matrix, i, j)) {
                    result = "Matrix has consecutive four in a row. Start on row: " + i + " and column: " + j;
                    hasConsecutiveFour = true;
                    break;

                }
                if (hasConsecutiveFourInColumn(matrix, i, j)) {
                    result = "Matrix has consecutive four in a column. Start on row: " + i + " and column: " + j;
                    hasConsecutiveFour = true;
                    break;
                }
                if (hasConsecutiveFourInDiagonal(matrix, i, j)) {
                    result = "Matrix has consecutive four in a diagonal. Start on row: " + i + " and column: " + j;
                    hasConsecutiveFour = true;
                    break;
                }
                result = "Matrix has not consecutive four";

            }
            if (hasConsecutiveFour) {
                break;
            }
        }
        return result;
    }

    public static boolean hasConsecutiveFourInRow(int[][] matrix, int row, int column) {
        if (column > matrix[row].length - 4) {
            return false;
        }

        for (int i = column; i < column + 4; i++) {
            if (matrix[row][column] != matrix[row][i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasConsecutiveFourInColumn(int[][] matrix, int indexR, int indexC) {
        if (indexR > matrix.length - 4) {
            return false;
        }

        for (int i = indexR; i < indexR + 4; i++) {
            if (matrix[indexR][indexC] != matrix[i][indexC]) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasConsecutiveFourInDiagonal(int[][] matrix, int indexR, int indexC) {

        if (hasRightDiagonal(matrix, indexR, indexC)) {
            return true;
        }
        if (hasLeftDiagonal(matrix, indexR, indexC)) {
            return true;
        }
        return false;
    }

    private static boolean hasRightDiagonal(int[][] matrix, int indexR, int indexC) {
        if (indexR > matrix.length - 4) {
            return false;
        }
        if (indexC > matrix[indexR].length - 4) {
            return false;
        }

        for (int i = indexR, j = indexC; i < indexR + 4; i++, j++) {
            if (matrix[indexR][indexC] != matrix[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasLeftDiagonal(int[][] matrix, int indexR, int indexC) {
        if (indexR < 3) {
            return false;
        }
        if (indexC > matrix[indexR].length - 4) {
            return false;
        }


        for (int i = indexR, j = indexC; i < indexR + 4; i--, j++) {
            if (matrix[indexR][indexC] != matrix[i][j]) {
                return false;
            }
        }
        return true;
    }
}
