package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers for x1, y1, x2, y2, x3, y3, x4, y4: ");

        double[][] points = createPoints();
        double[] intersectPoint = getIntersectPoint(points);
        double[] area = getArea(points, intersectPoint);

        sort(area);
        display(area);
    }

    public static double[][] createPoints() {
        Scanner input = new Scanner(System.in);
        double[][] result = new double[4][2];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }
        return result;

    }

    public static double[] getIntersectPoint(double[][] points) {
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

    public static double[] getArea(double[][] points, double[] intersectPoint) {
        int count = 0;
        double[] area = new double[4];

        area[0] = getTriangleArea(points, intersectPoint, area, 0, 1);
        area[1] = getTriangleArea(points, intersectPoint, area, 0, 2);
        area[2] = getTriangleArea(points, intersectPoint, area, 3, 1);
        area[3] = getTriangleArea(points, intersectPoint, area, 3, 2);


        return area;
    }

    private static double getTriangleArea(double[][] points, double[] intersectPoint, double[] area, int p0, int p1) {

        double side1 = Math.sqrt(Math.pow(points[p0][0] - points[p1][0], 2) + Math.pow(points[p0][1] - points[1][1], 2));
        double side2 = Math.sqrt(Math.pow(points[p0][0] - intersectPoint[0], 2) + Math.pow(points[p0][1] - intersectPoint[1], 2));
        double side3 = Math.sqrt(Math.pow(intersectPoint[0] - points[p1][0], 2) + Math.pow(intersectPoint[1] - points[1][1], 2));

        double s = (side1 + side2 + side3) / 2;
        double result = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return result;
    }


    public static void sort(double[] area) {
        for (int i = 0; i < area.length - 1; i++) {
            for (int j = i + 1; j < area.length; j++) {
                if(area[i] > area[j]) {
                    double temp =  area[i];
                    area[i] = area[j];
                    area[j] = temp;
                }
            }
        }
    }

    public static void display(double[] area){
        System.out.print("The areas are --> ");
        for (int i = 0; i < area.length; i++) {
            System.out.printf("%.2f ", area[i]);
        }
        System.out.println();
    }
}
