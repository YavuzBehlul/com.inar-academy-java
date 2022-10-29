package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five points: ");
        double[][] points = new double[5][2];

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        if (sameLine(points)) {
            System.out.println("The points are on the same line.");
        } else {
            System.out.println("The points are not on the same line.");
        }


    }

    public static boolean sameLine(double[][] points) {

        int p0, p1, p2;
        p0 = 0;
        p1 = points.length - 1;
        for (int i = 1; i < points.length - 1; i++) {
            p2 = i;

            boolean isOnTheSameLine = (points[p1][0] - points[p0][0]) *
                    (points[p2][1] - points[p0][1]) -
                    (points[p2][0] - points[p0][0]) *
                            (points[p1][1] - points[p0][1]) == 0;

            if (!isOnTheSameLine)
                return false;
        }
        return true;
    }
}
