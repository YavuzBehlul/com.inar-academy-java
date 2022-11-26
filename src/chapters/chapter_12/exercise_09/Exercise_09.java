package chapters.chapter_12.exercise_09;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;

        while (run){
            System.out.print("Enter a binary number: ");
            String s = input.nextLine();

            try {
                System.out.println("Value of " + s + " is: " + bin2Dec(s));
                run = false;

            }catch (BinaryFormatException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    public static int bin2Dec(String binary) throws BinaryFormatException{
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c != '0' && c != '1') {
                throw new BinaryFormatException(binary.toUpperCase());
            }
        }
        int result = 0;
        int pow = binary.length() - 1;
        for (int i = 0; i < binary.length(); i++) {
            result += Math.pow(2, pow--) * Integer.parseInt(binary.charAt(i) + "");
        }
        return result;

    }
}
