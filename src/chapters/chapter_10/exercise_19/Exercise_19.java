package chapters.chapter_10.exercise_19;

import java.math.BigInteger;

import static chapters.chapter_10.exercise_18.Exercise_18.isPrime;

public class Exercise_19 {
    public static void main(String[] args) {
        displayFirst100MersennePrime();
    }

    public static void displayFirst100MersennePrime() {
        System.out.printf("%-7s | %-7s\n", "p", "2^p - 1");

        int count = 0;
        BigInteger number = new BigInteger("2");

        while (count < 100) {
            if (isMersennePrime(number)) {
                System.out.printf("%-7d | %-7d\n", number, get2PowNumber(number).subtract(BigInteger.ONE));
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }

    public static boolean isMersennePrime(BigInteger number) {
        return isPrime(number) && isPrime(get2PowNumber(number).subtract(BigInteger.ONE));
    }

    public static BigInteger get2PowNumber(BigInteger number) {
        BigInteger powerOf2 = new BigInteger("2");
        BigInteger start = new BigInteger("1");

        while (start.compareTo(number) != 0) {
            powerOf2 = powerOf2.multiply(new BigInteger("2"));
            start = start.add(BigInteger.ONE);
        }
        return powerOf2;
    }
}
