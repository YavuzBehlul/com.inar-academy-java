package chapters.chapter_12.exercise_06;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();

            try {
                System.out.println("The decimal value for hex number " +
                        hex + " is " + hexToDecimal(hex.toUpperCase()));
                run = false;

            } catch (Exception ex) {
                System.out.println("It is not a hex number!");

            }
        }
    }
    public static int hexToDecimal(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (!(c >= 'A' && c <= 'F') && !(c >= '0' && c <= '9')) {
                throw new NumberFormatException();
            }
        }

        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if ('A' <= ch && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }

}
