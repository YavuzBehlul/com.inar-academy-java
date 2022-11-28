package chapters.chapter_12.exercise_31;

import java.io.File;
import java.util.Scanner;

public class Exercise_31_1 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the gender(M/F): ");
        char gender = input.next().charAt(0);

        System.out.print("Enter the name: ");
        String name = input.next();

        File file = new File("C:\\Users\\opggx_000\\Desktop\\babynames" + year + ".txt");

        if (!file.exists()) {
            System.out.println("No such file.");
            System.exit(1);
        }

        try (
                Scanner input2 = new Scanner(file)
        ) {
            while (input2.hasNext()) {
                int num = input.nextInt();
                String maleName = input.next();
                double maleBirthRate = input.nextDouble();
                String femaleName = input.next();
                double femaleBirthRate = input.nextDouble();

                if ((gender == 'M' && name.equals(maleName)) || (gender == 'F' && name.equals(femaleName))) {
                    System.out.println(name + " is ranked #" + num + " in year " + year);
                    break;

                }

            }
            System.out.println("The name " + name + " is not ranked in year " + year);
        }
    }
}
