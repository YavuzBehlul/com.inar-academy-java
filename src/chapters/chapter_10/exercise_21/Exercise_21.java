package chapters.chapter_10.exercise_21;

import java.math.BigInteger;

public class Exercise_21 {
    public static void main(String[] args) {
        BigInteger testNumber = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger five = BigInteger.valueOf(5l);
        BigInteger six = BigInteger.valueOf(6l);

        int count = 0;
        while (count < 10) {
            testNumber = testNumber.add(BigInteger.ONE);

            BigInteger remainderOf5 = testNumber.remainder(five);
            if (remainderOf5.intValue() == 0) {
                System.out.print("\n" + testNumber.toString());
                System.out.print(" divided by 5 = ");
                BigInteger result = testNumber.divide(five);
                System.out.print(result.toString());
                count++;
            }

            BigInteger remainderOf6 = testNumber.remainder(six);
            if (remainderOf6.intValue() == 0) {
                System.out.print("\n" + testNumber.toString());
                System.out.print(" divided by 6 = ");
                BigInteger result = testNumber.divide(six);
                System.out.print(result.toString());
                count++;
            }

        }
    }
}
