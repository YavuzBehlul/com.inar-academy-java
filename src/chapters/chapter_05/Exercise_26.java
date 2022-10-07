package chapters.chapter_05;

public class Exercise_26 {

	public static void main(String[] args) {
		
		double e = 2.0; // infinity olmasın diyerek 1 + 1/1! icin ikiden baslattım.
		double divisor = 0.0;
		
		for (int i = 2; i <= 100000; i++) {

			divisor += i * (i - 1);
			e += 1 / divisor;
			
			if (i % 10000 == 0) {
				System.out.println("e value of " + i + ": " + (e));
			}
		}

	}

}
