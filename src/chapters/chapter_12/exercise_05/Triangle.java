package chapters.chapter_12.exercise_05;

import chapters.chapter_11.exercise_01.SimpleGeometricObject;

public class Triangle extends SimpleGeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleException {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        double area = Math.sqrt(s * (s - this.side1) * (this.side2) * (this.side3));
        return area;
    }

    private boolean isLegalSides(double side1, double side2, double side3) {
        if ((side1 + side2 < side3) || (side2 + side3 < side1) || (side1 + side3 < side2) ||
                (side1 <= 0 || side2 <= 0 || side3 <= 0)) {
            return false;
        }
        return true;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) throws IllegalTriangleException {
        if (!isLegalSides(side1, this.side2, this.side3)) {
            throw new IllegalTriangleException(side1, this.side2, this.side3);
        }
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) throws IllegalTriangleException {
        if (!isLegalSides(this.side1, side2, this.side3)) {
            throw new IllegalTriangleException(this.side1, side2, this.side3);
        }
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) throws IllegalTriangleException {
        if (!isLegalSides(this.side1, this.side2, side3)) {
            throw new IllegalTriangleException(this.side1, this.side2, side3);
        }
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + this.side1 + "\nside2 = " + this.side2 + "\nside3 = " + this.side3;
    }
}
