package chapters.chapter_13.exercise_10;

public class Exercise_10 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(1,2);
        Rectangle r2 = new Rectangle(2,1);
        Rectangle r3 = new Rectangle(3,4);

        System.out.println("Area of Rectangle1 :" + r1.getArea());
        System.out.println("Area of Rectangle2 :" + r2.getArea());
        System.out.println("Area of Rectangle3 :" + r3.getArea());

        System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ") +
                "equal to Rectangle2.");

        System.out.println("Rectangle1 is " + (r1.equals(r3) ? "" : "not ") +
                "equal to Rectangle3.");
    }
}
