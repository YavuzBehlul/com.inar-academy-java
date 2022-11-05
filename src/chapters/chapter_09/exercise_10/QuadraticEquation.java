package chapters.chapter_09.exercise_10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return ((-1 * b) + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return ((-1 * b) - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public String toString() {
        if (getDiscriminant() < 0) {
            return "The equation has no real roots";
        }
        if (getDiscriminant() == 0) {
            return "The equation has one root: " + getRoot1();
        }
        return "Root 1: " + getRoot1() + ",  Root 2: " + getRoot2();
    }
}
