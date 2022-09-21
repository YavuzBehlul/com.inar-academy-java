package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.print("Enter the first day of the year: ");
		int startDay = input.nextInt();

		int days = 0;
		for (int month = 1; month <= 12; month++) {
			switch (month) {
			case 1:
				System.out.print("\n\nJanuary 1, " + year);
				days = 31;
				break;
			case 2:
				System.out.print("February 1, " + year);
				if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case 3:
				System.out.print("March 1, " + year);
				days = 31;
				break;
			case 4:
				System.out.print("April 1, " + year);
				days = 30;
				break;
			case 5:
				System.out.print("May 1, " + year);
				days = 31;
				break;
			case 6:
				System.out.print("June 1, " + year);
				days = 30;
				break;
			case 7:
				System.out.print("July 1, " + year);
				days = 31;
				break;
			case 8:
				System.out.print("August 1, " + year);
				days = 31;
				break;
			case 9:
				System.out.print("September 1, " + year);
				days = 30;
				break;
			case 10:
				System.out.print("October 1, " + year);
				days = 31;
				break;
			case 11:
				System.out.print("November 1, " + year);
				days = 30;
				break;
			case 12:
				System.out.print("December 1, " + year);
				days = 31;
			}
			
			switch(startDay) {
			case 0:
				System.out.println(" is Sunday\n");//sonraki dongularda 7 mod 0 cıkabılır
				break;
			case 1:
				System.out.println(" is Monday\n");
				break;
			case 2:
				System.out.println(" is Tuesday\n");
				break;
			case 3:
				System.out.println(" is Wednesday\n");
				break;
			case 4:
				System.out.println(" is Thursday\n");
				break;
			case 5:
				System.out.println(" is Friday\n");
				break;
			case 6:
				System.out.println(" is Saturday\n");
				break;
			case 7:
				System.out.println(" is Sunday\n");
				break;
				
			}
			startDay = (startDay + days) % 7;
		}
		input.close();

	}
}