package chapters.chapter_11.exercise_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        ArrayList<Integer> listOfAnswers = new ArrayList<Integer>();

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {

            if (listOfAnswers.contains(answer))
                System.out.println("You already entered. " + answer + " What is " +
                        number1 + " + " + number2 + "? ");

            else {
                System.out.print("Wrong answer. Try again. What is " +
                        number1 + " + " + number2 + "? ");
                listOfAnswers.add(answer);
            }
            answer = input.nextInt();
        }

        System.out.println("You got it!");
    }
}
