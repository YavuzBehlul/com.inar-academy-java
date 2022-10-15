package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long integer: ");
		String cardNum = input.next();

		System.out.println(cardNum + (isValid(Long.parseLong(cardNum)) ? " is valid." : " is invalid."));
		input.close();
	
	}

	
	 //Return true if the card number is valid
	 
	public static boolean isValid(long number) {
		
		String str = String.valueOf(number);
		
		if (str.length() < 13 || str.length() > 16) {			
			return false;
			
		} else if (prefixMatched(number, 4) || prefixMatched(number, 6) || prefixMatched(number, 5)
				|| prefixMatched(number, 37)) {
			
			int sumEven = sumOfDoubleEvenPlace(number);
			int sumOdd = sumOfOddPlace(number);
			int total = sumEven + sumOdd;
			return total % 10 == 0;
		}
		return false;
	}

	
	  //Get the result from Step 2
	 
	public static int sumOfDoubleEvenPlace(long number) {
		System.out.println("Sum of Double Even Place Numbers: ");
		
		int sum = 0;
		String num = String.valueOf(number);
		
		// Because it will return a total of 8 times		
		for (int i = num.length() - 2; i >= 0; i -= 2) {  
			// extracted digit
			int digit = Integer.parseInt(num.substring(i, i + 1));
			
			int temp = digit + digit;
			// Digit processed into
			int d = getDigit(temp);
			
			sum += d;
		}
		return sum;
	}

	
	 //Return this number if it is a single digit, otherwise, return the sum of the two digits
	 
	 
	public static int getDigit(int number) {
		if (getSize(number) > 1) {
			int d1 = number % 10;
			int d2 = number / 10;
			return d1 + d2;
		}
		return number;
	}

	
	 // Return sum of odd-place digits in number
	 
	public static int sumOfOddPlace(long number) {
		// Sum of Odd Place Numbers
		
		int sum = 0;
		String num = String.valueOf(number);
		
		for (int i = num.length() - 1; i >= 0; i -= 2) {
			int x = Integer.parseInt(num.substring(i, i + 1));
			// Extracted digit
			
			sum += x;
		}
		return sum;
	}

	
	 // Return true if the digit d is a prefix for number
	 
	public static boolean prefixMatched(long number, int d) {
		
		String str = String.valueOf(number);
		
		if (str.startsWith(String.valueOf(d))) {
			return true;
		}
		return false;
	}

	
	 // Return the number of digits in d
	 
	public static int getSize(long d) {
		String str = String.valueOf(d);
		return str.length();
	}

	
	 //Return the first k number of digits from number. If the number of digits in number is less than k, return number.
	  
	 
	public static long getPrefix(long number, int k) {
		if (getSize(number) < k) {
			return number;
		}
		String s = String.valueOf(number);
		return Long.parseLong(s.substring(0, k));

	}

}
