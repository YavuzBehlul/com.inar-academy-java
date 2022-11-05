package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 points for x and y: ");

        double[][] points = createPoints(4);
        double[] intersectPoint = getIntersectingPoint(points);

        if (intersectPoint == null) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.println("The intersecting point is (" + intersectPoint[0] + " , " + intersectPoint[1] + ")");
        }
    }

    public static double[][] createPoints(int numberOfPoints) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[numberOfPoints][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();

            }
        }
        return points;
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] result = new double[2];
        double a = points[0][1] - points[1][1];
        double b = points[0][0] - points[1][0];
        double c = points[2][1] - points[3][1];
        double d = points[2][0] - points[3][0];
        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = (points[2][1] - points[3][1]) + points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
        if (a * d - b * c == 0) {
            return null;
        } else {
            result[0] = (e * d - b * f) / (a * d - b * c);
            result[1] = (a * d - e * c) / (a * d - b * c);
        }
        return result;
    }
}
