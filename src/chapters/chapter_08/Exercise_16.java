package chapters.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of points : ");
        int numberOfPoints = input.nextInt();
        int[][] points = createRandomPoints(numberOfPoints);
        sort(points);


    }

    public static int[][] createRandomPoints(int number) {
        int[][] points = new int[number][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = (int) (1 + Math.random() * 10);
            points[i][1] = (int) (1 + Math.random() * 10);
        }
        return points;
    }

    public static void sort(int m[][]) {

        for (int i = 0; i < m.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (m[minIndex][0] > m[j][0]) {
                    minIndex = j;

                } else if (m[minIndex][0] == m[j][0] && m[minIndex][1] > m[j][1]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int[] temp = m[minIndex];
                m[minIndex] = m[i];
                m[i] = temp;


            }


        }

        for (int i = 0; i < m.length; i++) {
            System.out.print(Arrays.toString(m[i]) + " ");
        }

    }
}
