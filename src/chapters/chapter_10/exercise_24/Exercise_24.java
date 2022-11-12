package chapters.chapter_10.exercise_24;

public class Exercise_24 {
    public static void main(String[] args) {
        MyCharacter myCharacter = new MyCharacter('A');
        System.out.println(MyCharacter.getValueOf(myCharacter));
        myCharacter.toLowerCase();
        System.out.println(MyCharacter.getValueOf(myCharacter));
        myCharacter.toUpperCase();
        System.out.println(MyCharacter.getValueOf(myCharacter));
        System.out.println(myCharacter.isLetter());
        MyCharacter myCharacter2 = new MyCharacter('1');
        System.out.println(myCharacter2.isLetter());
        System.out.println(myCharacter2.isDigit());
        System.out.println(myCharacter.isDigitOrLetter());
        System.out.println(myCharacter2.isDigitOrLetter());
    }
}
