package chapters.chapter_13.exercise_16;

import chapters.chapter_13.exercise_14.Rational;

public class Exercise_16 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java Exercise_16 operand1 (space) operator (space) operand2");
            System.exit(0);
        }

        String output = args[0];

        String[] str = (args[0].replaceAll("\\s*", "/")).split("/");

        Rational r1 = new Rational(Integer.parseInt(str[0]),
                Integer.parseInt(str[1]));
        Rational r2 = new Rational(Integer.parseInt(str[3]),
                Integer.parseInt(str[4]));

        switch (str[2].charAt(0)) {
            case '+' :
                output += " = " + r1.add(r2);
                break;
            case '-' :
                output += " = " + r1.subtract(r2);
                break;
            case '.' :
                output += " = " + r1.multiply(r2);
                break;
            case '/' :
                output += " = " + r1.divide(r2);
                break;
            default :
                System.out.println("Illegal Argument: + - . /");
                System.exit(0);
        }

        System.out.println(output);
    }
}
