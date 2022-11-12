package chapters.chapter_10.exercise_20;

import java.math.BigDecimal;

public class Exercise_20 {
    public static void main(String[] args) {

        System.out.println(" i                e");
        System.out.println("-----------------------------------");
        for (BigDecimal i = new BigDecimal("100");
             i.compareTo(new BigDecimal("1000")) <= 0;
             i = i.add(new BigDecimal("100"))) {
            System.out.println(i + "    " + getE(i));
        }
    }

    public static BigDecimal getE(BigDecimal value) {
        BigDecimal one = new BigDecimal("1");
        BigDecimal e = new BigDecimal("0.0");
        for (BigDecimal i = one; i.compareTo(value) <= 0; i = i.add(one)) {
            BigDecimal denominator = i;
            for (BigDecimal k = i.subtract(one);
                 k.compareTo(one) >= 1;
                 k = k.subtract(one)) {
                denominator = denominator.multiply(k);
            }
            // Use 25 digits of precision
            e = e.add(one.divide(denominator, 25, BigDecimal.ROUND_UP));
        }
        return e;
    }
}
