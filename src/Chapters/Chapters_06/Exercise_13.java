package chapters.chapter_06;

public class Exercise_13 {

	public static void main(String[] args) {

		double number = 20;
		System.out.println("i           m(i)");
		System.out.println("------------------");
		estimateSum(number);
	}

	public static void estimateSum(double number) {
		double result = 0;

		for (number = 1; number <= 20; number++) {
			result += number / (number + 1.0);
			System.out.printf("%-7.0f%10.4f\n", number, result);

		}

	}

}
