package chapters.chapter_13.exercise_18;

import chapters.chapter_13.exercise_15.Rational;

import java.math.BigInteger;

public class Exercise_18 {
    public static void main(String[] args) {

        Rational r = new Rational(BigInteger.ONE, new BigInteger("2"));

        for (BigInteger i = r.getNumerator().add(BigInteger.ONE);
             i.compareTo(new BigInteger("100")) <= 0;
             i = i.add(BigInteger.ONE)) {

            r = r.add(new Rational(i, i.add(BigInteger.ONE)));
        }

        System.out.println(r);
    }
}
