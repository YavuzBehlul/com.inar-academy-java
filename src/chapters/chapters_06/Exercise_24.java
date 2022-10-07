package chapters.chapter_06;

public class Exercise_24 {
	static int daysElapsedCurrentYear;
	static int getDaysElapsedCurrentMonth;

	public static void main(String[] args) {
		String time = getCurrentTime(System.currentTimeMillis());
		String date = getCurrentDate(System.currentTimeMillis());
		System.out.println("The current date is " + date + ". And the current time is " + time);

	}

	public static String getCurrentDate(long millis) {
		long seconds = millis / 1000;
		long min = seconds / 60;
		long hours = min / 60;
		long days = hours / 24;
		
		int year = getYear((int) days);
		
		int month = getCurrentMonth(year, daysElapsedCurrentYear);
		return month + "/" + getDaysElapsedCurrentMonth + "/" + year;
	}

	private static String getCurrentTime(long millis) {
		long seconds = millis / 1000;
		long currentSecond = seconds % 60;

		long min = seconds / 60;
		long currentMin = min % 60;

		long hours = min / 60;
		long currentHour = hours % 24;

		return currentHour + ":" + currentMin + ":" + currentSecond + "(GMT)";

	}

	public static int getYear(int totalDays) {
		int year = 1970;
		while (totalDays > 365) {
			totalDays -= numberOfDaysInAYear(year);
			year++;
			daysElapsedCurrentYear = totalDays;
		}
		return year;
	}

	public static int numberOfDaysInAYear(int year) {
		return isLeapYear(year) ? 366 : 365;
	}

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static int getCurrentMonth(int year, int daysElapsedInYear) {
		int month = 0;
		while (daysElapsedInYear > 0) {
			month++;
			getDaysElapsedCurrentMonth = daysElapsedInYear;
			daysElapsedInYear -= getNumberOfDaysInMonth(year, month);

		}
		return month;

	}

	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else {
			return isLeapYear(year) ? 29 : 28;
		}

	}
}
