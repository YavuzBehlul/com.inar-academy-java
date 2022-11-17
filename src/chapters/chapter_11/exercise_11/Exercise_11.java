package chapters.chapter_11.exercise_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        sort(list);
        System.out.println(list.toString());
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
