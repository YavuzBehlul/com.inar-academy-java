package chapters.chapter_07;

public class Exercise_07 {

	public static void main(String[] args) {
		int[] counts = new int[10];
		int randomNum = 0;

		for (int i = 0; i < 100; i++) {
			randomNum = (int) (Math.random() * 10);
			counts[randomNum]++;
		}
		toPrintCountOfNumbers(counts);
	}

	public static void toPrintCountOfNumbers(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%-2d counts of %2d \n", counts[i], i);
		}
	}
}
