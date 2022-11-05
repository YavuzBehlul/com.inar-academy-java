package chapters.chapter_09.exercise_04;

import java.util.Random;

public class Exercise_04 {
    public static void main(String[] args) {
        Random random = new Random(1000);

        for (int i = 0; i < 50; i++) {
            System.out.printf("%-4d",random.nextInt(100));

            if (((i + 1) % 10) == 0) {
                System.out.println();
            }
        }
    }
}
