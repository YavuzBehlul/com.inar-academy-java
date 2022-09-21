package chapters.chapter_06;

public class Exercise_14 {

	public static void main(String[] args) {
		System.out.println("i               m(i)");
		System.out.println("----------------------");

		for (int i = 1; i < 1000; i += 100) {
			System.out.printf("%-5d%15.5f\n", i, pi(i));

		}

	}

	public static double pi(double number) {
		double result = 0;

		for (int i = 1; i <= number; i++) {

			result += Math.pow(-1, i + 1) / (2 * i - 1);
		}
		return (result * 4);
	}
}