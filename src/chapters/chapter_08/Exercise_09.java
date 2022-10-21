package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] table = new char[3][3];
        boolean isFinish = false;

        char token = 'X';

        while (!isFinish) {
            printTable(table);

            System.out.println("Enter a row(0, 1 or 2) for player " + token + " : ");
            int row = input.nextInt();
            System.out.println("Enter a column (0, 1 or 2) for player " + token + " : ");
            int column = input.nextInt();

            boolean validInput = (row < 3 && row >= 0) && (column < 3 && column >= 0);

            while (!checkPosible(table, row, column, validInput)) {
                if (!validInput) {
                    System.out.println("Row and column can only 0 , 1 or 2.");
                    System.out.println("Enter a row(0, 1 or 2) for player " + token + " : ");
                    row = input.nextInt();
                    System.out.println("Enter a column (0, 1 or 2) for player " + token + " : ");
                    column = input.nextInt();
                    validInput = (row < 3 && row >= 0) && (column < 3 && column >= 0);
                } else {
                    System.out.println("Already entered a value row " + row + " and column " + column);

                    printTable(table);
                    System.out.println("Enter a row(0, 1 or 2) for player " + token + " : ");
                    row = input.nextInt();
                    System.out.println("Enter a column (0, 1 or 2) for player " + token + " : ");
                    column = input.nextInt();
                }
            }

            placeToken(table, row, column, token);

            if (isPlayerWon(table, token)) {
                printTable(table);
                System.out.println(token + " player won!");
                isFinish = true;
            } else if (isDraw(table)) {
                printTable(table);
                System.out.println("It is a draw!Sorry! Play again.");
                isFinish = true;
            } else {
                token = token == 'X' ? 'O' : 'X';

            }
        }
    }

    public static void printTable(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == 'X' || table[i][j] == 'O') {
                    System.out.print("|" + table[i][j]);
                } else {
                    System.out.print("| ");
                }
            }
            System.out.println("|\n-------");
        }
    }

    public static boolean checkPosible(char[][] table, int row, int column, boolean validInput) {
        if (!validInput)
            return false;
        if (table[row][column] == 'O' || table[row][column] == 'X') {
            return false;
        }
        return true;
    }

    public static void placeToken(char[][] table, int row, int column, char token) {
        table[row][column] = token;
    }

    public static boolean isPlayerWon(char[][] table, char token) {
        if (checkRow(table, token)) {
            return true;
        }
        if (checkColumn(table, token)) {
            return true;
        }
        if (checkDiagonal(table, token)) {
            return true;
        }
        return false;
    }


    public static boolean checkRow(char[][] table, char token) {
        for (int i = 0; i < table.length; i++) {
            int count = 0;
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == token) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumn(char[][] table, char token) {
        for (int column = 0; column < table.length; column++) {
            int count = 0;
            for (int i = 0; i < table.length; i++) {
                if (table[i][column] == token) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonal(char[][] table, char token) {
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i][i] == token) {
                count++;
            }
        }
        if (count == 3) {
            return true;
        }

        count = 0;
        for (int i = table.length - 1; i >= 0; i--) {
            if (table[i][i] == token) {
                count++;
            }
        }
        if (count == 3) {
            return true;
        }
        return false;
    }

    public static boolean isDraw(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }
}
