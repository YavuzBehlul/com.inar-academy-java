package chapters.chapter_12.exercise_07;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run){
            System.out.print("Enter a binary number: ");
            String s = input.nextLine();

            try {
                System.out.println(bin2Dec(s));
                run = false;

            }catch (Exception ex){
                System.out.println("Input is not a binary number!");
            }
        }
    }
    public static int bin2Dec(String binary){

        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c != '0' && c != '1') {
                throw new NumberFormatException();
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
