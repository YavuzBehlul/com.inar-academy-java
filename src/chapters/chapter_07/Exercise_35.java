package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char play = 'Y';

        while (play == 'Y') {

            String result = getRandomWord();
            String word = result.toUpperCase();
            char[] astericks = createAstericks(word.length());
            int count = 0;

            while (!openAstericks(astericks)) {

                System.out.print("(Guess) Enter a letter in word " + printAstericks(astericks) + "-->");
                char guess = Character.toUpperCase(input.next().charAt(0));

                if (isAlreadyInTheWord(astericks, guess)) {
                    System.out.println(guess + " is already in the word.");

                } else if (isGuessInTheword(guess, word, astericks)) {//astericks are updated here.

                } else {
                    count++;
                    System.out.println(guess + " is not in the word");
                }
            }
            System.out.println("The word is " + result + ".You missed " + count + (count > 1 ? " times" : " time"));
            System.out.print("Do you want to guess another word? Enter y or n>");
            play = Character.toUpperCase(input.next().charAt(0));
        }
    }

    public static String getRandomWord() {
        String[] word = {"Number", "World", "Java", "UnitedStatesOfAmerica", "Wheel", "Time", "Game", "Throne", "Knight",
                "Student", "School", "Country", "Primary", "Integer", "Stack", "Queue", "Map", "Computer", "InarAcademy"};
        return word[(int) (Math.random() * word.length)];
    }

    public static char[] createAstericks(int length) {
        char[] astericks = new char[length];
        for (int i = 0; i < astericks.length; i++) {
            astericks[i] = '*';
        }
        return astericks;
    }

    public static boolean openAstericks(char[] astericks) {
        for (int i = 0; i < astericks.length; i++) {
            if (astericks[i] == '*') {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlreadyInTheWord(char[] astericks, char guess) {
        for (int i = 0; i < astericks.length; i++) {
            if (astericks[i] == guess) {
                return true;
            }
        }
        return false;
    }

    public static boolean isGuessInTheword(char guess, String word, char[] astericks) {
        boolean inWord = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                astericks[i] = guess;
                inWord = true;
            }
        }
        return inWord;
    }

    public static String printAstericks(char[] astericks) {
        String result = "";
        for (int i = 0; i < astericks.length; i++) {
            result += astericks[i];
        }
        return result;
    }
}
