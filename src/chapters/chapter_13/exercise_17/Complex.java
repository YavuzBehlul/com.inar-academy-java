package chapters.chapter_13.exercise_17;

public class Complex implements Cloneable{
    private double a;
    private double b;

    public Complex() {
        this(0, 0);
    }

    public Complex(double a) {
        this(a, 0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex secondComplex) {
        return new Complex(a + secondComplex.getRealPart(),
                b + secondComplex.getImaginaryPart());
    }

    public Complex subtract(Complex secondComplex) {
        return new Complex(a - secondComplex.getRealPart(),
                b - secondComplex.getImaginaryPart());
    }

    public Complex multiply(Complex secondComplex) {
        return new Complex(a * secondComplex.getRealPart() - b * secondComplex.getImaginaryPart(),
                b * secondComplex.getRealPart() + a * secondComplex.getImaginaryPart());
    }

    public Complex divide(Complex secondComplex) {
        return new Complex((a * secondComplex.getRealPart() + b * secondComplex.getImaginaryPart()) /
                (Math.pow(secondComplex.getRealPart(), 2) + Math.pow(secondComplex.getImaginaryPart(), 2)),
                (b * secondComplex.getRealPart() - a * secondComplex.getImaginaryPart()) /
                        (Math.pow(secondComplex.getRealPart(), 2) +  Math.pow(secondComplex.getImaginaryPart(), 2)));
    }

    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public Complex clone() throws CloneNotSupportedException {
        return (Complex)super.clone();
    }

    @Override
    public String toString() {
        return b == 0 ? a + "" : "(" + a + " + " + b + "i)";
    }
}
