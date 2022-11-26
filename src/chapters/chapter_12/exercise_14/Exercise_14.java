package chapters.chapter_12.exercise_14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the path of file: ");
        String path = new Scanner(System.in).nextLine();
        File file = new File(path);

        if (!file.exists()) {
            System.out.println(file.getName() + " does not exists!");
            System.exit(1);
        }

            displaySumAndAverage(file);


    }
    private static void displaySumAndAverage(File file) throws IOException{
        int count = 0;
        double sum = 0;

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                sum += input.nextDouble();
                count++;
            }
            System.out.printf("Summation: %f\nNumber of integers: %d\nAverage: %.2f"
                    ,sum, count, (sum / count));
        }
    }


}
