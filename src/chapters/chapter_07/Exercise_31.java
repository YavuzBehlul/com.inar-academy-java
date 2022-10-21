package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of list1: ");
        int len1 = input.nextInt();
        System.out.println("Enter list1: ");
        int[] list1 = new int[len1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();

        }
        System.out.println("Enter length of list2: ");
        int len2 = input.nextInt();
        System.out.println("Enter list2: ");
        int[] list2 = new int[len2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(merge(list1, list2)));
    }

    public static int[] merge(int[] list1, int[] list2) {
        int len = list1.length + list2.length;
        int[] result = new int[len];
        for (int i = 0; i < list1.length; i++) {
            result[i] = list1[i];

        }
        for (int i = 0; i < list2.length ; i++) {
            result[i+list1.length] = list2[i];
        }

        Arrays.sort(result);
        return result;
    }
}
