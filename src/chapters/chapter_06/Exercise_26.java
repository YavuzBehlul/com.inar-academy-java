package chapters.chapter_06;

public class Exercise_26 {

	public static void main(String[] args) {
		int count = 1;
		int i = 2;
		while (count <= 100) {
			if (isPalindromicPrime(i)) {
				System.out.printf("%-7d", i);
				if (count % 10 == 0) {
					System.out.println();
				}
				count++;
			}

			i++;
		}
	}

	public static boolean isPalindromicPrime(int number) {
		boolean isPPrime = true;

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPPrime = false;
				break;
			}
		}
		if (isPPrime) {
			return checkPalindrome(number);
		}
		return false;
	}

	static boolean checkPalindrome(int number) {

		String str = String.valueOf(number);

		for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
