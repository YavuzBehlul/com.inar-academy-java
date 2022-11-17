package chapters.chapter_11.exercise_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        int[][] matrix = createRandomMatrix();

        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();

        countsRows(rows, matrix);
        countCols(cols, matrix);

        display(matrix);

        displayMaxIndexInRows(rows);
        displayMaxIndexInColumns(cols);

    }

    private static void displayMaxIndexInRows(ArrayList<Integer> list) {
        System.out.print("The largest row index:");
        sort(list);
        System.out.println(list.get(list.size()-1));
        System.out.println();
    }

    private static void displayMaxIndexInColumns(ArrayList<Integer> list) {
        System.out.print("The largest column index:");
        sort(list);
        System.out.println(list.get(list.size()-1));
        System.out.println();
    }

    public static int[][] createRandomMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = input.nextInt();

        int[][] result = new int[n][n];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 2);
            }
        }
        return result;
    }

    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void countsRows(ArrayList<Integer> list, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            list.add(count);
        }
    }

    public static void countCols(ArrayList<Integer> list, int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            list.add(count);
        }
    }
    public static void sort(ArrayList<Integer> list) {
        //      java.util.Collections.sort(list);

        int currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.size() - 1; i++) {

            currentMin = list.get(i);
            currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {

                if (currentMin > list.get(j)) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }


}
