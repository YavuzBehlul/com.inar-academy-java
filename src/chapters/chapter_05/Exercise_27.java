package chapters.chapter_05;

public class Exercise_27 {

	public static void main(String[] args) {
		int total = 0;
		int i = 1;
		for (int year = 101; year <= 2100; year++) {

			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.print(year + " ");
				
				total += 1;
				
				if (i % 10 == 0) {
					System.out.println();
				}
				i++;
			}

		}
		
		System.out.println("\nTotal leap years is: " + total);

	}

}
