package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("*** Convert Millesecond ***\nEnter the millesecond: ");
		long millis = input.nextLong();
		
		System.out.println(convertMillis(millis));
		
		input.close();

	}

	public static String convertMillis(long millis) {
		long seconds = millis / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;
		
		return hours + ":" + (minutes % 60) + ":" + (seconds % 60);
	}
}
