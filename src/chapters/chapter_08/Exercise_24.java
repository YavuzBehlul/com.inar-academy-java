package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_24 {
    public static void main(String[] args) {
        int[][] sudoku = getAnswer();

        if (isValidSudoku(sudoku)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static int[][] getAnswer() {
        Scanner input = new Scanner(System.in);

        int[][] sudoku = new int[9][9];

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                sudoku[i][j] = input.nextInt();
            }
        }
        return sudoku;
    }

    public static boolean isValidSudoku(int[][] sudoku) {
        if (!isUniqueInRow(sudoku)) {
            return false;
        }
        if (!isUniqueInColumn(sudoku)) {
            return false;
        }
        if (!isUniqueInSmallBox(sudoku)) {
            return false;
        }

        return true;
    }

    public static boolean isUniqueInRow(int[][] sudoku) {

        for (int i = 0; i < sudoku.length; i++) {
            boolean[] uniqueRow = new boolean[9];
            for (int j = 0; j < sudoku[i].length; j++) {
                if (uniqueRow[sudoku[i][j] - 1]) {
                    return false;
                } else {
                    uniqueRow[sudoku[i][j] - 1] = true;
                }
            }
        }
        return true;
    }

    public static boolean isUniqueInColumn(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            boolean[] uniqueColumn = new boolean[9];
            for (int j = 0; j < sudoku[i].length; j++) {
                if (uniqueColumn[sudoku[j][i] - 1]) {
                    return false;
                } else {
                    uniqueColumn[sudoku[j][i] - 1] = true;
                }
            }
        }
        return true;
    }

    public static boolean isUniqueInSmallBox(int[][] sudoku) {

        for (int boxNumber = 0; boxNumber < 9; boxNumber++) {
            boolean[] uniqueSmallBox = new boolean[9];
            for (int i = (boxNumber / 3) * 3; i < (boxNumber / 3) * 3 + 3; i++) {
                for (int j = (boxNumber % 3) * 3; j < (boxNumber % 3) * 3 + 3; j++) {
                    if (uniqueSmallBox[sudoku[i][j] - 1]) {
                        return false;
                    } else {
                        uniqueSmallBox[sudoku[i][j] - 1] = true;
                    }
                }
            }
        }
        return true;
    }
}
