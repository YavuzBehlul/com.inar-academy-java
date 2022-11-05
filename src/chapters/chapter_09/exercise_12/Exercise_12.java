package chapters.chapter_09.exercise_12;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {


        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = getPoints();
        double[] p = getArguments(points);

        LinearEquation intersectingPoint = new LinearEquation(p[0], p[1], p[2], p[3], p[4], p[5]);


        if (intersectingPoint.isSolvable()) {
            System.out.println("The intersecting point is at (" + intersectingPoint.getX() + ", " + intersectingPoint.getY() + ")");
        }
        else
            System.out.println("The two lines are parallel");
    }


    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }


    public static double[] getArguments(double[][] points) {
        double[] p = new double[6];
        p[0] = points[0][1] - points[1][1];
        p[1] = -1 * (points[0][0] - points[1][0]);
        p[2] = points[2][1] - points[3][1];
        p[3] = -1 * (points[2][0] - points[3][0]);
        p[4] = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        p[5] = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
        return p;
    }
}
