package chapters.chapter_06;

public class Exercise_28 {

	public static void main(String[] args) {
		
		System.out.println("p\s\s\s\s2^p-1");
		
		for (int number = 2; number <= 31; number++) {
			System.out.print(mersennePrime(number));
		}
	}

	static String mersennePrime(int number) {
		int pow = 2;
		for (int i = 1; i < number; i++) {
			pow = pow * 2;
		}
		int checkNum = pow - 1;

		if (isPrime(checkNum)) {
			return number + "\s\s\s\s" + checkNum + "\n";
		}
		return "";
	}

	static boolean isPrime(int num) {
		
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
