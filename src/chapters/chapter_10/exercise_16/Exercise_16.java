package chapters.chapter_10.exercise_16;

import java.math.BigInteger;

public class Exercise_16 {
    public static void main(String[] args) {

        String str = "1";
        for (int i = 0; i < 49; i++) {
            str += "0";
        }

        displayBiggerThan50Decimal(str);

    }

    public static void displayBiggerThan50Decimal(String str) {

        BigInteger number = new BigInteger(str);
        BigInteger divisor2 = new BigInteger("2");
        BigInteger divisor3 = new BigInteger("3");
        BigInteger zero = new BigInteger("0");

        int count = 0;
        while (count < 10) {
            if (number.remainder(divisor2).compareTo(zero) == 0 || number.remainder(divisor3).compareTo(zero) == 0) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
