package chapters.chapter_10.exercise_13;

public class Exercise_13 {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("r1.contains(3, 3): " + r1.contains(3, 3));
        System.out.println("r1.contains(new MyRectangle2D(4, 5, 10.5,3.2)): " +
                r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println("r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)): " +
                r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));


        MyRectangle2D r2 = new MyRectangle2D(0, 0, 4, 4);
        MyRectangle2D r3 = new MyRectangle2D(0, 0, 4.1, 4.1);
        System.out.println(r2.contains(r3));
        System.out.println(r3.contains(r2));
        MyRectangle2D r4 = new MyRectangle2D(3, 3, 2, 2);
        System.out.println(r2.overlaps(r4));

    }
}
