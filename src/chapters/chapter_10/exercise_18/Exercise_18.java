package chapters.chapter_10.exercise_18;

import java.math.BigInteger;

public class Exercise_18 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int countPrime = 0;
        final int NUMBER_OF_PRIMES = 5;

        while (countPrime < NUMBER_OF_PRIMES) {
            number = number.add(new BigInteger("1"));
            if (isPrime(number)){
                countPrime++;
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(BigInteger number) {
        BigInteger divisor = new BigInteger("2");
        BigInteger zero = new BigInteger("0");
        BigInteger endNumber = number.divide(new BigInteger("2")).add(BigInteger.ONE);
        while (divisor.compareTo(endNumber) != 0) {
            if (number.remainder(divisor).compareTo(zero) == 0) {
                return false;
            }
            divisor = divisor.add(BigInteger.ONE);
        }
        return true;
    }
}
