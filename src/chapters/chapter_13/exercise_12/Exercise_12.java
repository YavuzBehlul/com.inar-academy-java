package chapters.chapter_13.exercise_12;

import chapters.chapter_13.exercise_01.GeometricObject;
import chapters.chapter_13.exercise_09.Circle;
import chapters.chapter_13.exercise_10.Rectangle;

public class Exercise_12 {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = {new Circle(5),
                new Circle(8),
                new Rectangle(3, 4),
                new Rectangle(4, 2)};

        System.out.println("Total area of elements in array: " + sumArea(geometricObjects));
    }

    public static double sumArea(GeometricObject[] oArr) {
        double summation = 0;

        for (int i = 0; i < oArr.length; i++) {
            summation += oArr[i].getArea();
        }
        return summation;
    }
}
