package chapters.chapter_10.exercise_17;

import java.math.BigInteger;

public class Exercise_17 {
    public static void main(String[] args) {
        displaySquareNumbers(10);
    }

    public static void displaySquareNumbers(int i) {
        long square = (long) (Math.sqrt(Long.MAX_VALUE)) + 1;

        BigInteger number= new BigInteger(square + "");

        System.out.println("LONG.MAX_VALUE is: " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("The first ten square numbers that are greater than Long.MAX_VALUE: ");
        for (int j = 0; j < i; j++) {

            System.out.println(number.multiply(number));

            number = number.add(BigInteger.ONE);
        }


    }
}
