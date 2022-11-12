package chapters.chapter_10.exercise_13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public double getArea() {
        return width * height;
    }

    public boolean contains(double x, double y) {
        return ((this.x + (width / 2) >= x && x >= this.x - (width / 2)) &&
                (this.y + (height / 2) >= y && y >= this.y - (height / 2)));
    }

    public boolean contains(MyRectangle2D r) {
        return
                getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 &&
                        getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
                        height / 2 + r.getHeight() / 2 <= height &&
                        width / 2 + r.getWidth() / 2 <= width;

    }

    public boolean overlaps(MyRectangle2D r) {
        return !contains(r) &&
                ((x + width / 2 > r.getX() - r.getWidth()) ||
                        (y + height / 2 > r.getY() - r.getHeight())) &&
                (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) &&
                (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    }

    public String toString() {
        return "Rectangle's center (" + this.getX() + ", " + this.getY() + ") width -> " + getWidth() + " height -> " + getHeight();
    }

    private double getDistance(double p1, double p2) {
        return Math.sqrt(Math.pow(p2 - p1, 2));
    }
}
