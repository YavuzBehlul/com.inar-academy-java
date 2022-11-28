package chapters.chapter_12.exercise_08;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("Enter a hex number: ");
            String hex = input.nextLine();

            try {
                System.out.println("Value of " + hex.toUpperCase() +
                        " is " + hexToDecimal(hex.toUpperCase()));
                run = false;

            } catch (HexFormatException ex) {
                System.out.println(ex.getMessage());

            }
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException {

        for (int i = 0; i < hex.length(); i++) {
            char chr = hex.charAt(i);
            if (!(chr >= 'A' && chr <= 'F') && !(chr >= '0' && chr <= '9')) {
                throw new HexFormatException(hex);
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
