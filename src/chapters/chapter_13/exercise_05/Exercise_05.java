package chapters.chapter_13.exercise_05;

public class Exercise_05 {
    public static void main(String[] args) {

        Circle circle1 = new Circle(12, "red", true);
        Circle circle2 = new Circle(34, "blue",true);

        System.out.println("\nArea of Circle 1: ");
        System.out.println(circle1.getArea());

        System.out.println("\nArea of Circle 2: ");
        System.out.println(circle2.getArea());

        System.out.println("\nMax circle was \n----------------------------- ");
        System.out.println(Circle.max(circle1, circle2));
        System.out.println("----------------------------");

        Rectangle rectangle1 = new Rectangle(10, 8, "red", true);
        Rectangle rectangle2 = new Rectangle(11, 7, "blue", true);

        System.out.println("\nArea of Rectangle 1: ");
        System.out.println(rectangle1.getArea());

        System.out.println("\nArea of Rectangle 2: ");
        System.out.println(rectangle1.getArea());

        System.out.println("\nMax rectangle was \n--------------------------");
        System.out.println(Rectangle.max(rectangle1, rectangle2));
        System.out.println("----------------------------");

    }

}
