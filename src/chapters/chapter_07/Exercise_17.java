package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students:");
		
		int numberOfStudents = input.nextInt();
		
		double[] scores = new double[numberOfStudents];
		String[] names = new String[numberOfStudents];

		for (int i = 0; i < names.length; i++) {
			
			System.out.print("Enter a student name:");
			names[i] = input.next();
			
			System.out.print("Enter the students score:");
			scores[i] = input.nextDouble();
		}
		input.close();

		getSortedArray(scores, names);
		System.out.println("Result of decreasing order of their scores are: ");

		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"-) Name: " + names[i] + " Score: " + scores[i]);
		}
	}

	public static void getSortedArray(double[] scores, String[] names) {
		
		for (int i = 0; i < scores.length; i++) {
			double max = scores[i];
			int index = i;
			String tempName;
			double tempScore;
			
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[j] > max) {
					max = scores[j];
					index = j;
				}
			}
			if (index != i) {
				
				tempName = names[i];
				names[i] = names[index];
				names[index] = tempName;
				
				tempScore = scores[i];
				scores[i] = scores[index];
				scores[index] = tempScore;
			}
		}

	}

}
