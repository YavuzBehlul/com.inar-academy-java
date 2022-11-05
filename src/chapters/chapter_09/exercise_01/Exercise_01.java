package chapters.chapter_09.exercise_01;

public class Exercise_01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1 width: " + rectangle1.width + " height: " + rectangle1.height + "" +
                " perimeter is:" + rectangle1.getPerimeter() + " area is: " + rectangle1.getArea());

        System.out.println("Rectangle 1 width:" + rectangle2.width + " height: " + rectangle2.height + "" +
                " perimeter is:" + rectangle2.getPerimeter() + " area is: " + rectangle2.getArea());
    }
}
