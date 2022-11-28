package chapters.chapter_12.exercise_23;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_23 {public static void main(String[] args) {

    ArrayList<Double> list = new ArrayList<>();

    try {
        java.net.URL url = new java.net.URL(
                "/scores.txt");

        Scanner input = new Scanner(url.openStream());

        while (input.hasNext()) {
            list.add(input.nextDouble());
        }

        double total = sum(list);

        System.out.printf("Total scores: %.0f\n", total);
        System.out.printf("Average score: %.0f\n", (total / list.size()));

    }
    catch (java.net.MalformedURLException ex) {
        System.out.println("Invalid URL");
    }
    catch (java.io.IOException ex) {
        System.out.println("I/O Errors: No such file");
    }
}

    public static double sum(ArrayList<Double> list) {
        double summation = 0;

        for (int i = 0; i < list.size(); i++) {
            summation += list.get(i);
        }
        return summation;
    }
}
