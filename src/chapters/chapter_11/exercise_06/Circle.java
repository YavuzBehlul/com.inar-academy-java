package chapters.chapter_11.exercise_06;

public class Circle {
    private double radius = 1;
    private static int numberOfObjects = 0;

    public Circle() {
        numberOfObjects++;
    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius >= 0) ? radius : 0;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "\nRadius:" + getRadius() + "Area: " + getArea();
    }
}
