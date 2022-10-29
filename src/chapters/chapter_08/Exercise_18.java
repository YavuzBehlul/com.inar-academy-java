package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array --> ");
        int size = input.nextInt();
        int[][] array = createArray(size);
        System.out.println("Before shuffling array is: ");
        display(array);
        shuffleRow(array);
        System.out.println("After shuffling array is: ");
        display(array);
    }

    public static int[][] createArray(int size) {
        int[][] result = new int[size][2];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 10);
            }
        }
        return result;
    }

    public static void display(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("{%1d, %1d}  ", array[i][0], array[i][1]);
        }
        System.out.println();

    }

    public static void shuffleRow(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int index = (int)(Math.random() * array.length);
            int[] temp = array[i];
            array[i] = array[index];
            array[index] = temp;

        }
    }
}
