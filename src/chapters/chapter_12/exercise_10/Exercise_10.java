package chapters.chapter_12.exercise_10;

public class Exercise_10 {
    public static void main(String[] args) {
        int length = 1_000_000_000;

        try {
            byte[] array = new byte[length];
        }
        catch (OutOfMemoryError ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error handled.");
        }
        System.out.println("Program continue...");
    }
}
