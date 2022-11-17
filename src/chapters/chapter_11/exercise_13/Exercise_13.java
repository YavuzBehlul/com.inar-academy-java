package chapters.chapter_11.exercise_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        removeDuplicate(list);

        System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        Integer temp;
        for (int i = 0; i < list.size(); i++) {

            temp = list.get(i);

            list.remove(i);

            while (list.contains(temp)) {

                list.remove(temp);
            }

            list.add(i, temp);

        }


    }
}
