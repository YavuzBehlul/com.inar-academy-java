package chapters.chapter_10.exercise_05;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        System.out.print("The smallest factors of " + number + " are: ");

        StackOfIntegers factors = new StackOfIntegers();
        smallestFactors(number, factors);
        displayFactors(factors);
    }

    public static void smallestFactors(int number, StackOfIntegers stack) {
        int i = 2;
        while (number / i != 1) {
            if (number % i == 0) {
                stack.push(i);
                number /= i;
            } else
                i++;
        }
        stack.push(number);
    }

    public static void displayFactors(StackOfIntegers factors) {
        while (!factors.empty()) {
            System.out.print(factors.pop() + " ");
        }
    }
}
