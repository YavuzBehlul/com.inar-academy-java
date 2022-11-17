package chapters.chapter_11.exercise_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int m = in.nextInt();

        int n = multiplyInArray(findOddN(findFactorsM(m)));
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + m * n);

    }

    static ArrayList<Integer> findFactorsM(int number) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int divisor = 2;
        while (number != 1) {

            if (number % divisor == 0) {
                result.add(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }
        return result;
    }

    static ArrayList<Integer> findOddN(ArrayList<Integer> factors) {
        ArrayList<Integer> oddCounts = new ArrayList<Integer>();

        for (int i = 0; i < factors.size(); i++) {

            int number = factors.get(i);
            int count = 0;

            for (Integer e : factors) {
                if (e == number) {
                    count++;
                }
            }
            if (count % 2 != 0 && !oddCounts.contains(number)) {
                oddCounts.add(number);
            }
        }
        return oddCounts;
    }
    private static int multiplyInArray(ArrayList<Integer> list) {
        int result = 1;
        for (int i = 0; i < list.size(); i++) {
            result *= list.get(i);
        }
        return result;
    }
}
