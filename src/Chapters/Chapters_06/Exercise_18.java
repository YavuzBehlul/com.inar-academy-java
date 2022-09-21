package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the password to check: ");
		String password = input.next();
		System.out.println(validatePassword(password) ? "Valid Password" : "Invalid Password");

		input.close();

	}

	static boolean validatePassword(String password) {
		int count = 0;
		
		if (password.length() < 8) {
			return false;
		}
		for (int i = 0; i < password.length(); i++) {
			char chr = password.charAt(i);
			
			if (Character.isDigit(chr)) {
				count++;
				
			} else if (!Character.isLetter(chr)) {
				return false;
			}
		}
		return count >= 2;
	}
}
