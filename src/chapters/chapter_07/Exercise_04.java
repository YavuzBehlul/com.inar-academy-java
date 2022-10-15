package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] scoreS = new double[100];
		
		int count = 0;
		double sum = 0;
		System.out.println("Enter scores: \nnegatif number ends the program");
		
		for(int i = 0; i < 100 ; i++) {
			double score = input.nextInt();
			if(score < 0) {
				break;
			}
			scoreS[i] = score;
			count++;
			sum += scoreS[i];
		}
		toPrint(scoreS, sum, count, getAverage(sum, count));
		input.close();

	}
	public static double getAverage(double sum ,int count) {
		double average = sum /count ;
			return 	average;
	}
	public static void toPrint(double[] scoreS , double sum , int count , double average) {
		int above = 0;
		int equale = 0;
		int below = 0;
		
		for (int i = 0; i <= count ; i++) {
			if(scoreS[i] > average) {
				above++;
			}else if(scoreS[i] == average) {
				equale++;
				
			}else {
				below++;
			}
		}
		System.out.printf("Number of score is %d \nAverage is %1.2f \n" , count, average);
		System.out.printf("Number of scores above the average is %d \n",above);
		System.out.printf("Number of scores equale the average is %d \n",equale);
		System.out.printf("Number of score below the average is %d ", below);
	}

}