package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_41 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        int max = 0;
	        int count = 0;
	        int numberStart = 1;
	        
	        System.out.println("Enter numbers: \n0 ends the program");
	        
	        while(numberStart != 0) {

	        	
	            numberStart = input.nextInt();

	            if (numberStart > max) {
	                count = 1;
	                max = numberStart;
	                continue;
	            }
	            if (numberStart == max) {
	                count++;
	            }

	        } 
	        System.out.println("The largest number is: " + max + "\nThe occurrence count of the number is: " + count);
	        input.close();
	}

}
