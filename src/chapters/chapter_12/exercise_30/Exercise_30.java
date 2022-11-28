package chapters.chapter_12.exercise_30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a path for the file: ");

        File file = new File(input1.next());

        if (!file.exists()) {
            System.out.println("File " + file.getName() + " does not exist");
            System.exit(0);
        }

        int[] counter = new int[26];
        try (
                Scanner input2 = new Scanner(file);
        ) {

            while (input2.hasNext()) {
                String line = (input2.nextLine()).toUpperCase();
                countLetters(counter, line);
            }
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.println("Number of " + (char)('A' + i) + "'s: " + counter[i]);
        }
    }

    public static void countLetters(int[] counter, String str) {

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                counter[(int)(str.charAt(i) - 'A')]++;
        }
    }

}
