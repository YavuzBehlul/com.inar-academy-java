package chapters.chapter_09.exercise_10;

public class Exercise_10 {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(1.0, 3, 1);
        QuadraticEquation quadraticEquation2 = new QuadraticEquation(1.0, 2, 1);
        QuadraticEquation quadraticEquation3 = new QuadraticEquation(1.0, 2, 3);
        System.out.println("quadraticEquation1: " + quadraticEquation1.toString());
        System.out.println("quadraticEquation2: " + quadraticEquation2.toString());
        System.out.println("quadraticEquation3: " + quadraticEquation3.toString());
    }
}
