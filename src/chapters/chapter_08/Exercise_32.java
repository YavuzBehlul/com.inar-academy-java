package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {

        double[][] points = createPoints();
        double area = getTriangleArea(points);

        if (area == 0) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.printf("The area of the triangle is %.2f", area);
        }

    }

    public static double[][] createPoints() {
        Scanner input = new Scanner(System.in);

        double[][] result = new double[3][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();

            }
        }
        return result;
    }
    //(x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0
    public static double getTriangleArea(double[][] points) {

        if ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]) == 0) {
            return 0;
        }

        double side1 = Math.sqrt(Math.pow(points[0][0] - points[1][0], 2) + Math.pow(points[0][1] - points[1][1], 2));
        double side2 = Math.sqrt(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2));
        double side3 = Math.sqrt(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2));

        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        return area;
    }
}
