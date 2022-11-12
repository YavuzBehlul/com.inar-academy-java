package chapters.chapter_10.exercise_11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double getPerimeter() {
        return (Math.PI * this.radius * 2);
    }

    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
    }

    public boolean contains(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2))
                <= Math.abs(radius - circle.getRadius());
    }
    public boolean overlaps(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2))
                <= radius + circle.getRadius();
    }
}
