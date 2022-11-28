package chapters.chapter_12.exercise_31;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        String year = input.nextLine();

        System.out.print("Enter the gender: ");
        String gender = input.nextLine();

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(
                    "https://www.ssa.gov/oact/babynames/decades/names" +
                            year + "s.html");

            input = new Scanner(url.openStream());

            while (input.hasNext()) {
                for (int i = 0; i < 5; i++) {
                    list.add(i, input.next());
                }

                if (list.get(gender(gender)).equals(name)) {
                    System.out.println(
                            name + " is ranked:" + list.get(0) + " in year " + year);
                    System.exit(0);
                }
                list.clear();
            }
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }

        System.out.println("The name " + name + " is not ranked in year " + year);
    }

    public static int gender(String gender) {
        if (gender.equals("M"))
            return 1;
        else
            return 3;
    }

}
