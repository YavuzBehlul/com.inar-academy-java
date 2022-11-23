package chapters.chapter_12.exercise_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        boolean b = true;

        while (b) {
            System.out.println("Enter two integers: ");

            try {
                n1 = input.nextInt();
                n2 = input.nextInt();
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                b = false;

            } catch (InputMismatchException ex) {
                System.out.println("Invalid input!");
                input.nextLine();
            }
        }
    }
}
