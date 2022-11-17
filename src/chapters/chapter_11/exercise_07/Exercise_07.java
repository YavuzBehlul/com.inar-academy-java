package chapters.chapter_11.exercise_07;

import java.util.ArrayList;

public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        fillRandomly(list);
        displayList(list);

        shuffle(list);

        System.out.println("\nShuffling..............................\n");
        displayList(list);

    }
    public static void fillRandomly(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 1000));
        }
    }
    public static void shuffle(ArrayList<Integer> list) {
        int temp;
        int randomIndex;
        for (int i= 0 ; i < list.size(); i++) {
            randomIndex = (int) (Math.random() * list.size());
            temp = list.get(randomIndex);

            list.set(randomIndex, list.get(i));
            list.set(i, temp);

        }
    }

    public static void displayList(ArrayList<Integer> list) {
        for (Integer e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }


}
