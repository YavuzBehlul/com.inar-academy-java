package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        System.out.println("(Display an integer reversed)\n Enter and integer : ");
        int number = input.nextInt();
        reverse(number);
        input.close();
    }

    public static void reverse(int number) {
        while (number > 0) {
            System.out.print(number % 10);
            number = (number / 10);

        }

	}

}
