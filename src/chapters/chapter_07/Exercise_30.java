package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int length = input.nextInt();
        int[] arr = new int[length];

        System.out.print("Enter the values: ");
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        if (isConsecutiveFour(arr)) {
            System.out.println("The list has consecutive fours.");
        } else {
            System.out.println("The list has no consecutive fours.");
        }
    }


    public static boolean isConsecutiveFour(int[] arr) {
        int numbs4 = arr[0];
        int count = 0;
        boolean flag = false;

        for (int j = 1; j < arr.length; j++) {
            if (numbs4 == arr[j]) {
                count++;
            } else {
                numbs4 = arr[j];
                count = 0;
            }
            if (count == 3) {
               flag = true;
            }
        }
        return flag;
    }
}
