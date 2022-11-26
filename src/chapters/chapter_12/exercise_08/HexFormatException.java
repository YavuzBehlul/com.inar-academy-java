package chapters.chapter_12.exercise_08;

public class HexFormatException extends NumberFormatException{
    private String hexString;

    public HexFormatException() {
        this("");
    }
    public HexFormatException(String hexString) {
        super(hexString  + " is not a hex value!\n");
        this.hexString = hexString;
    }

    public String getHexString() {
        return this.hexString;
    }
}
