package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students: ");
		int number = input.nextInt();
		System.out.println("Enter " + number + " scores: ");

		int[] score = new int[number];

		for (int i = 0; i < score.length; i++) {

			score[i] = input.nextInt();
		}
		input.close();
		
		printLetterScore(score, findBestScore(score));

	}

	public static int findBestScore(int[] score) {
		int best = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > best) {
				best = score[i];
			}

		}
		return best;
	}

	public static void printLetterScore(int[] score, int best) {

		for (int i = 0; i < score.length; i++) {
			char letterScore;
			
			if (score[i] >= (best - 10)) {
				letterScore = 'A';
				
			} else if (score[i] >= (best - 20)) {
				letterScore = 'B';
				
			} else if (score[i] >= (best - 30)) {
				letterScore = 'C';
				
			} else if (score[i] >= (best - 40)) {
				letterScore = 'D';
				
			} else {
				letterScore = 'F';
			}
			System.out.println("Student " + (i+1) + " score is " + score[i] + " and grade is " + letterScore);
		}

	}
}
