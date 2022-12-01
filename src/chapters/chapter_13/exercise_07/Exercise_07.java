package chapters.chapter_13.exercise_07;

import chapters.chapter_13.exercise_01.GeometricObject;

public class Exercise_07 {
    public static void main(String[] args) {

        GeometricObject[] squares = {new Square(12),
                                    new Square(34),
                                    new Square(56.7),
                                    new Square(78),
                                    new Square(99)};


        for (int i = 0; i < squares.length; i++) {

            System.out.println("\nSquare " + (i + 1));
            System.out.println("Area: " + squares[i].getArea());
            ((Square)squares[i]).howToColor();
        }
    }
}
