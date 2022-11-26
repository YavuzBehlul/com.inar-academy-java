package chapters.chapter_12.exercise_09;

public class BinaryFormatException extends NumberFormatException{
    private String binaryString;

    public BinaryFormatException() {
        this(null);
    }

    public BinaryFormatException(String binaryString) {
        super(binaryString + " is not a binary value!\n");
        this.binaryString = binaryString;
    }

    public String getBinaryString() {
        return this.binaryString;
    }
}
