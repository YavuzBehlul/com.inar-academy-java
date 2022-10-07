package chapters.chapter_06;

public class Exercise_33 {
	private static final int CURRENT_YEAR = 2022;
	private static final int START_YEAR = 1970;
	private static int daysInCurrentMonth;

	public static void main(String[] args) {
		System.out.println("The current date and time is " + getCurrentDateTime(3) + "\s (GMT+3)");

		
	}

	static String getCurrentDateTime(int timeZoneGTM) {
		
		// Elapsed time in milliseconds since midnight of January 1, 1970
		long currentTimeMillis = System.currentTimeMillis();

		// Find total seconds, 1000 milliseconds in one second.
		long totalSeconds = currentTimeMillis / 1000;

		// Current second is equal to the remainder after dividing total seconds by 60
		long secondNow = totalSeconds % 60;

		String currentTime = ":" + secondNow;

		// Get total minutes, 60 seconds in one minute
		long totalMinutes = totalSeconds / 60;

		// Current minute is the remainder after dividing total minutes by 60
		long minuteNow = totalMinutes % 60;
		currentTime = ":" + minuteNow + currentTime;

		// Get total hours, 60 minutes in one hour.
		long totalHours = totalMinutes / 60;

		// Current hour is the remainder after dividing total hours by 24.
		long hourNow = totalHours % 24;
		currentTime = (hourNow+timeZoneGTM) + currentTime;

		// Get days, 24 hours in one day.
		long totalDays = totalHours / 24;

		//  we have to subtract 1 for years with only 366 days if we want to determine the current day using the total days elapsed
		
		long daysAccountLeapYears = totalDays - getNumLeapYears(START_YEAR);
		
		int currentYearDays = (int) (daysAccountLeapYears % 365);

		// Get the number representing the current month
		int monthNow = getMonthFromDays(currentYearDays);
		
		
		return monthName(monthNow) + " " + daysInCurrentMonth + ", " + CURRENT_YEAR + " " + currentTime;

	}

	

	static int getNumLeapYears(int startYear) {
		
		int totalLeapYears = 0;
		for (int year = startYear; year <= CURRENT_YEAR; year++) {
			if (isLeapYear(year)) {
				
				totalLeapYears++;
			}
		}
		return totalLeapYears;
	}

	static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	public static String monthName(int number) {
		switch (number) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		}
		return "error";
	}

	static int daysInMonth(int month) {
		switch (month) {
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear(CURRENT_YEAR) ? 28 : 29;
		}
		return -1;
	}

	
	static int getMonthFromDays(int days) {
		if (days < 32) {
			daysInCurrentMonth = days;
			return 1;
		}
		int month = 2;
		while (days > 0) {
			// daysInCurrentMonth will be last value for days before days < zero
			daysInCurrentMonth = days; 
			days -= daysInMonth(month++);
		}
		return month;

	}

}
