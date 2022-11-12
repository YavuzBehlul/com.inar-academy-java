package chapters.chapter_10.exercise_11;

public class Exercise_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(10, 10, 10);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Circle1 contains (15,15): " + (c1.contains(15, 15) ? "Yes" : "No"));

        System.out.println(
                "Circle1 contain the circle centered at (4, 5) and radius 10.5: "
                        + (c1.contains(new Circle2D(4, 5, 10.5))?"Yes":"No"));
        System.out.println(
                "Circle1 overlap the circle centered at (3, 5) and radius 2.3: "
                        + (c1.overlaps(new Circle2D(3, 5, 2.3))?"Yes":"No"));
    }
}
