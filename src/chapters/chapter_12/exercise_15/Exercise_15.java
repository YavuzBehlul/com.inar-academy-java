package chapters.chapter_12.exercise_15;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) throws Exception {
        String pathName ="C:\\Users\\opggx_000\\Desktop\\Exercise12_15.txt";
        File file = new File(pathName);

        if (file.exists()) {
            System.out.println("There is already a file.");
            System.exit(1);
        }

        writeRandomNumbersToFile(file, 100);

        ArrayList<Integer> list = sortIntegerInFile(file);

        displayList(list);

    }

    private static void displayList(ArrayList<Integer> list) {
        int count = 0;
        while (!list.isEmpty()) {
            count++;
            System.out.printf("%3d ", list.remove(0));
            if (count % 10 == 0)
                System.out.println();
        }
    }

    private static ArrayList<Integer> sortIntegerInFile(File file) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                list.add(input.nextInt());
            }
        }
        Collections.sort(list);
        return list;
    }


    private static void writeRandomNumbersToFile(File file, int limit) throws Exception {
        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            for (int i = 0; i < limit; i++) {
                int random = (int) (Math.random() * 1000);
                output.print(random + " ");
            }
        }
    }
}
