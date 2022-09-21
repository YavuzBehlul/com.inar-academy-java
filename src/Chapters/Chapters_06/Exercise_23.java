package Chapters.Chapters_06;
import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("*** Occurrences of a Specified ***\nEnter a string: ");
        String str = input.next();
        String chr0 = input.next();
        input.close();

        char chr = chr0.charAt(0);
        str = str.trim();

        System.out.println("The character " + chr + " repeats " + count(str, chr) + " times in " + str);

    }

    public static int count(String str, char chr) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                count++;
            }
        }
        return count;
    }
}
