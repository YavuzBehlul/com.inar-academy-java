package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities : ");
        int numberOfCities = input.nextInt();
        double[][] citiesCoordinates = new double[numberOfCities][2];

        System.out.println("Enter the coordinates of the cities : ");
        for (int i = 0; i < citiesCoordinates.length; i++) {
            citiesCoordinates[i][0] = input.nextDouble();
            citiesCoordinates[i][1] = input.nextDouble();
        }

        double[] centralCity = findCentralCity(citiesCoordinates);
        double totalDistance = calculateTotalDistance(centralCity, citiesCoordinates);

        System.out.println("The central city is at (" + centralCity[0] + ", " + centralCity[1] + ")");
        System.out.printf("The total distance to all other cities is %.2f", totalDistance);
    }

    public static double[] findCentralCity(double[][] cities) {
        double[] central = new double[2];
        sort(cities);
        central[0] = cities[cities.length / 2][0];
        central[1] = cities[cities.length / 2][1];
        return central;
    }

    public static void sort(double[][] cities) {
        for (int i = 0; i < cities.length - 1; i++) {
            int min = i;
            for (int j = 0; j < cities[i].length ; j++) {
                if(cities[i][0] < cities[j][0]) {
                    min = j;
                } else if (cities[i][0] == cities[j][0] && cities[i][1] == cities[j][1]) {
                    min = j;
                }
            }
            if (min != i) {
                double[] temp = cities[i];
                cities[i] = cities[min];
                cities[min] = temp;
            }
        }
    }

    public static double calculateTotalDistance(double[] central, double[][] cities) {
        double sum = 0;
        for (int i = 0; i < cities.length; i++) {
            if(central == cities[i])
                continue;
            double distance = distance(central, cities[i]);
            sum += distance;
        }
        return sum;
    }

    public static double distance(double[] c1, double[] c2) {
        return Math.sqrt(Math.pow(c1[0] - c2[0], 2) + Math.pow(c1[1] - c2[1], 2));
    }
}
