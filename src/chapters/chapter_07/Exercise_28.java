package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter ten integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        toPrintCombination(arr);
    }

    private static void toPrintCombination(int[] arr) {
        for (int k : arr) {
            for (int i : arr) {
                if (k != i) System.out.println("[" + k + "," + i + "]");
            }
        }
    }
}
