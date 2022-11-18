package chapters.chapter_11.exercise_01;

public class Exercise_01 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,3);

        System.out.println("Perimeter: " +triangle.getPerimeter());
        System.out.println("Area: "+triangle.getArea());
        System.out.println(triangle);
    }
}
