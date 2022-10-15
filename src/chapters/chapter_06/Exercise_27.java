package chapters.chapter_06;

public class Exercise_27 {

	public static void main(String[] args) {
		
		int count = 1;
		int i = 2;
		
		while (count <= 100) {
			
			if (isEmirps(i)) {
				
				System.out.printf("%-7d", i);
				
				if (count % 10 == 0) {
					System.out.println();
				}
				count++;
			}

			i++;
		}
	}

	public static boolean isEmirps(int number) {
		
		if (isPrime(number)) {
			
			String str = String.valueOf(number);
			
			if (checkPalindrome(str)) {
				
				return false;
				
			} else {
				
				String result = "";
				
				for (int i = str.length() - 1; i >= 0; i--) {
					result += str.charAt(i);
				}
				
				int reverseNum = Integer.parseInt(result);
				return isPrime(reverseNum);
			}
		}
		return false;
	}

	public static boolean isPrime(int number) {
		
		for (int i = 2; i <= number / 2; i++) {
			
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean checkPalindrome(String number) {
		
		for (int i = 0, j = number.length() - 1; i < number.length() / 2; i++, j--) {
			
			if (number.charAt(i) != number.charAt(j)) {
				return false;
			}
		}
		return true;

	}

}
