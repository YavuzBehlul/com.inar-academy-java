package chapters.chapter_12.exercise_25;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {

        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Salary.txt");
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String[] line = (input.nextLine()).split(" ");
                processData(assistant, associate, full, line[2], new Double(line[3]));
            }
        } catch (java.net.MalformedURLException ex) {
            System.out.println("MalformedURL Error: Invalid URL");
            System.exit(0);

        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: No such file");
            System.exit(1);
        }

        double sumAssistant = getSummation(assistant);
        double sumAssociate = getSummation(associate);
        double sumFull = getSummation(full);
        double sumFaculty = (sumAssistant + sumAssociate + sumFull);

        System.out.println("\n   Total salary");
        System.out.println("---------------------");
        System.out.printf("Assistant professors: $%.2f\n", sumAssistant);
        System.out.printf("Associate professors: $%.2f\n", sumAssociate);
        System.out.printf("Full professors:      $%.2f\n", sumFull);
        System.out.printf("All faculty:          $%.2f\n", sumFaculty);

        System.out.println("\n   Average salary");
        System.out.println("---------------------");
        System.out.printf("Assistant professors: $%.2f\n",
                (sumAssistant / assistant.size()));
        System.out.printf("Associate professors: $%.2f\n",
                (sumAssociate / associate.size()));
        System.out.printf("Full professors:      $%.2f\n",
                (sumFull / full.size()));
        System.out.printf("All faculty:          $%.2f\n",
                (sumFaculty / (assistant.size() + associate.size() + full.size())));
    }

    public static double getSummation(ArrayList<Double> list) {
        double summation = 0;
        for (int i = 0; i < list.size(); i++) {
            summation += list.get(i);
        }
        return summation;
    }

    public static void processData(ArrayList<Double> a, ArrayList<Double> b,
                                   ArrayList<Double> c, String rank, double salary) {
        if (rank.equals("assistant")) {
            a.add(salary);
        } else if (rank.equals("associate")) {
            b.add(salary);
        } else if (rank.equals("full")) {
            c.add(salary);
        }
    }
}
