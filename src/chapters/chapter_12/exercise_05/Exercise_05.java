package chapters.chapter_12.exercise_05;

public class Exercise_05 {
    public static void main(String[] args) throws IllegalTriangleException {

        try {
            Triangle triangle = new Triangle(100, 3, 2);

        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
