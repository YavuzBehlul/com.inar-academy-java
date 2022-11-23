package chapters.chapter_12.exercise_03;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        int[] arr = getRandomArray(100);

        Scanner input = new Scanner(System.in);
        int index;
        boolean go = true;

        while (go) {

            System.out.println("Enter an index: ");
            index = input.nextInt();

            try {

                System.out.println("Index [" + index + "] is: " + arr[index]);
                go = false;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("The index you enter is out of bounds");
                System.out.println();
            }
        }
    }
    private static int[] getRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }
}
