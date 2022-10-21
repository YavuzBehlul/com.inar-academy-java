package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 8 points : ");

        double[][] points = new double[8][2];

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {

                points[i][j] = input.nextDouble();
            }
        }


        int p1 = 0;
        int p2 = 1;


        double shortest = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);


        for (int i = 1; i < points.length; i++) {
            for (int j = i + 1; j < points[i].length; j++) {
                double dis = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (dis < shortest) {
                    p1 = i;
                    p2 = j;
                    shortest = dis;


                }
            }

        }
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]) == shortest)
                    System.out.println("The closest two points are " +
                            "(" + points[i][0] + ", " + points[i][1] + ") and (" +
                            points[j][0] + ", " + points[j][1] + ")");
            }
        }

    }

    public static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2));


    }
}
