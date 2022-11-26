package chapters.chapter_12.exercise_21;

import java.io.File;
import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\opggx_000\\Desktop\\SortedStrings.txt");

        if (!file.exists()) {
            System.out.println(file.getName() + " does not exist");
            System.exit(0);
        }
        System.out.println("File: " + file.getName());
        System.out.println("Pathname: C:\\Users\\opggx_000\\Desktop\\SortedStrings.txt");
        System.out.println("------------------------");
        System.out.println("Is the file sorted?");
        try {
            isFileSorted(file);
        } catch (Exception ex) {
            System.out.println("No!");
        }

    }
    private static boolean isFileSorted(File file) throws Exception {

        boolean dataSorted = true;
        String string1 = "";
        String string2 = "";

        try (
                Scanner input = new Scanner(file);
        ) {
            if (input.hasNext())
                string1 = input.next();

            while (input.hasNext() && dataSorted) {
                string2 = input.next();

                if (string1.compareTo(string2) > 0) {
                    System.out.println(
                            "The strings " + string1 + " and " + string2 +
                                    " are out of order");
                    dataSorted = false;
                }
                string1 = string2;
            }
        }

        if (dataSorted) {
            System.out.println(
                    "The strings in the file are stored in increasing order");
            return true;
        }
        return false;
    }
}
