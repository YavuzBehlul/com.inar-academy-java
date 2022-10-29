package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] array = createArray();
        display(array);

        System.out.print("Enter the row number you want to flip: ");
        int row = input.nextInt();

        System.out.print("Enter the column number you want to flip: ");
        int column = input.nextInt();

        array[row][column] = array[row][column] == 1 ? 0 : 1;
        System.out.println();

        int[] flippedCoin = findFlippedCoin(array);
        display(array);

        System.out.println("Flipped coin coordinates are (" + flippedCoin[0] + ", " + flippedCoin[1] + ")");


    }

    public static int[][] createArray() {
        int[][] array = {{0, 1, 1, 0, 1 ,1},
                {1, 0, 1, 0, 1, 1},
                {1, 1, 0, 1, 0, 1},
                {1, 1, 0, 1, 1, 0},
                {0, 0, 1, 0, 0, 1},
                {1, 1, 1, 0, 1, 0}};
        return array;
    }

    public static int[] findFlippedCoin(int[][] array) {

        int indexOfRow = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 1) {
                    count++;
                }
            }
            if(count % 2 != 0){
                indexOfRow = i;
                break;
            }
        }
        int indexOfColumn = -1;

        for (int i = 0; i < array[0].length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] == 1) {
                    count++;
                }
            }
            if(count % 2 != 0) {
                indexOfColumn = i;
                break;
            }
        }
        int[] result = new int[2];
        result[0] = indexOfRow;
        result[1] = indexOfColumn;
        return result;

    }

    public static void display(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
