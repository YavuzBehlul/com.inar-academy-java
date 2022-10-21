package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_33 {
    public static void main(String[] args) {

        String[] animalNames = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit",
                "dragon","snake","horse","sheep"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year for Chinese Zodiac:");
        int year = input.nextInt();
        input.close();
        System.out.println(animalNames[year % 12]);



    }

}
