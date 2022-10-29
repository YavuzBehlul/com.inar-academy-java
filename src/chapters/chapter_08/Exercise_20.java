package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] table = createTable();
        boolean isGameFinish = isGameFinish(table);

        char token = 'R';
        int[] socket = new int[table[0].length];

        while (!isGameFinish) {

            displayTable(table);

            System.out.println("Drop a " + (token == 'R' ? "Red " : "Yellow") + " disk at column (0–6): ");
            int drop = input.nextInt();

            while (socket[drop] == table.length) {
                System.out.println("This column is full.Please re-enter new column: ");
                drop = input.nextInt();
            }
            placeToken(token, table, socket, drop);

            if (isWin(table, token)) {
                displayTable(table);
                System.out.println((token == 'R' ? "Red " : "Yellow ") + "win the game.");
                isGameFinish = true;
            } else {
                if (isGameFinish(table)) {
                    isGameFinish = isGameFinish(table);
                    System.out.println("It is a draw.");
                } else {
                    token = token == 'R' ? 'Y' : 'R';
                }
            }
        }
    }


    public static char[][] createTable() {
        char[][] table = new char[6][7];
        return table;
    }

    public static boolean isGameFinish(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == '\u0000') {
                    return false;
                }

            }
        }
        return true;
    }

    public static void displayTable(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.print("|");
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == 'R' || table[i][j] == 'Y') {
                    System.out.print(table[i][j] + "|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
        System.out.println("================");
    }

    public static void placeToken(char token, char[][] table, int[] socket, int drop) {
        socket[drop]++;
        table[table.length - socket[drop]][drop] = token;
    }

    public static boolean isWin(char[][] table, char token) {
        boolean isWin = checkRow(table, token);
        if (isWin) {
            return true;
        }
        isWin = checkColumn(table, token);
        if (isWin) {
            return true;
        }
        isWin = checkDiagonal(table, token);
        return isWin;
    }

    public static boolean checkRow(char[][] table, char token) {

        for (int i = table.length - 1; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == token) {
                    count++;
                    if (count == 4)
                        break;
                } else {
                    count = 0;
                }
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColumn(char[][] table, char token) {
        for (int column = 0; column < table[0].length; column++) {
            int count = 0;
            for (int row = table.length - 1; row >= 0; row--) {
                if (table[row][column] == token) {
                    count++;
                    if (count == 4) {
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonal(char[][] table, char token) {
        if (checkRightDiagonal(table, token)) {
            return true;
        }
        if (checkLeftDiagonal(table, token)) {
            return true;
        }
        return false;
    }

    public static boolean checkRightDiagonal(char[][] table, char token) {
        for (int row = table.length - 1; row >= 3; row--) {
            for (int column = 0; column <= table[0].length - 4; column++) {
                int count = 0;
                for (int i = row, j = column; i >= row - 3; i--, j++) {
                    if (table[i][j] == token) {
                        count++;
                    }
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkLeftDiagonal(char[][] table, char token) {
        for (int row = table.length - 1; row >= 3; row--) {
            for (int column = table[0].length - 1; column >= 3; column--) {
                int count = 0;
                for (int i = row, j = column; i >= row - 3; i--, j--) {
                    if (table[i][j] == token) {
                        count++;
                    } else {
                        count = 0;
                    }
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
