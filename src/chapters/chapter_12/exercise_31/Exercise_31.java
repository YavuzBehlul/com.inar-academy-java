package chapters.chapter_12.exercise_31;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the gender(M/F): ");
        char gender = input.next().charAt(0);
        System.out.print("Enter the name: ");
        String name = input.next();

        File file = new File("C:\\Users\\opggx_000\\Desktop\\babynameranking" + year + ".txt");

        if (!file.exists()) {
            System.out.println("No such file.");
            System.exit(1);
        }
        boolean isFound = false;

        try (
                Scanner input2 = new Scanner(file)
        ) {
            while (input2.hasNext()) {
                int num = input2.nextInt();
                String maleName = input2.next();
                double maleBirthRate = input2.nextDouble();
                String femaleName = input2.next();
                double femaleBirthRate = input2.nextDouble();

                if ((gender == 'M' && name.equals(maleName)) || (gender == 'F' && name.equals(femaleName))) {
                    System.out.println(name + " is ranked #" + num + " in year " + year);
                    isFound = true;
                    break;
                }
            }
        }
        if (!isFound) {
            System.out.println("The name " + name + " is not ranked in year " + year);
        }
    }

}
