package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("***Count the Letters in a String***\nEnter a string:");
		String string= in.next();
		
		System.out.println("Number of letters: " + countLetters(string));
		in.close();

	}
	public static int countLetters(String str) {
		
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
        	
            char chr = str.charAt(i);
            
            if (Character.isLetter(chr)) {
                count++;
            }
        }
        return count;
    }
}
