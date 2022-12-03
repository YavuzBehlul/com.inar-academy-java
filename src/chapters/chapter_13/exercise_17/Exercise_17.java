package chapters.chapter_13.exercise_17;

import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.print("Enter the first complex number: ");
        Complex complexNumber1 = getComplex();

        System.out.print("Enter the second complex number: ");
        Complex complexNumber2 = getComplex();


        System.out.print(complexNumber1 + " + " + complexNumber2 + " = ");
        print(complexNumber1.add(complexNumber2));

        System.out.print(complexNumber1 + " - " + complexNumber2 + " = ");
        print(complexNumber1.subtract(complexNumber2));

        System.out.print(complexNumber1 + " * " + complexNumber2 + " = ");
        print(complexNumber1.multiply(complexNumber2));

        System.out.print(complexNumber1 + " / " + complexNumber2 + " = ");
        print(complexNumber1.divide(complexNumber2));

        System.out.println("|" + complexNumber1 + "| = " +
                complexNumber1.abs());
    }

    public static void print(Complex n) {
        if (n.getImaginaryPart() == 0)
            System.out.println(n.getRealPart());
        else
            System.out.println(n.getRealPart() + " + " +
                    n.getImaginaryPart() + "i");
    }

    public static Complex getComplex() {
        Scanner input = new Scanner(System.in);
        double[] c = new double[2];
        for (int i = 0; i < c.length; i++)
            c[i] = input.nextDouble();
        return new Complex(c[0], c[1]);
    }
}
