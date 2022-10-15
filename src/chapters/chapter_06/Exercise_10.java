package chapters.chapter_06;

public class Exercise_10 {

	public static void main(String[] args) {
		System.out.println("***The number of prime numbers less than 10_000***");
		printPrimeNumbers(10_000);
		
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 20;
		int count = 0;
		int number = 2;
		while (count < numberOfPrimes) {
			if (isPrime(number)) {
				count++;

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.printf("%-8d\n", number);

				} else {
					System.out.printf("%-8d", number);
				}

			}
			number++;
		}
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
