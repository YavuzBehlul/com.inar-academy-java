package chapters.chapter_05;

public class Exercise_25 {

	public static void main(String[] args) {
		
		double pi = 0.0;
		for (int i = 1; i <= 100000; i++) {

			pi += Math.pow(-1, i + 1) / (2 * i - 1.0);
			
			if (i % 10000 == 0) {
				System.out.println("Pi value of " + i + ": " + (4.0 * pi));
			}
		}

	}

}
