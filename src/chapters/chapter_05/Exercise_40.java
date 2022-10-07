package chapters.chapter_05;

public class Exercise_40 {
	public static void main(String[] args) {

		System.out.println("Flipping a coin 1_000_000 times.");

		int heads = 0;
		int tails = 0;
		int count = 0;

		while (count < 1_000_000) {

			double flipping = Math.random();

			if (flipping > 0.5) {
				heads++;
			} else {
				tails++;
			}
			count++;
		}
		System.out.println("Heads: " + heads + "\nTails: " + tails);
		

	}
}