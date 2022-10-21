package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_34 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine().trim();

        System.out.print("Sorted result: ");
        System.out.print(sort(str));

        input.close();
    }


    public static String sort(String s) {

        char[] chars = s.toCharArray();
        char temp;

        for (int i = 0; i < chars.length - 1; i++) {
            char currentMin = chars[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < chars.length; j++) {
                if (currentMin > chars[j]) {
                    currentMin = chars[j];
                    currentMinIndex = j;
                }

            }
            if (currentMinIndex != i) {
                chars[currentMinIndex] = chars[i];
                chars[i] = currentMin;
            }
        }


        return Arrays.toString(chars);

    }


}
