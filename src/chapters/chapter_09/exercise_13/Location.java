package chapters.chapter_09.exercise_13;

public class Location {
    private int row;
    private int col;
    private double maxValue;

    public Location(int row, int col, double maxValue) {
        this.row = row;
        this.col = col;
        this.maxValue = maxValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public String toString() {
        String output;
        output = "The location of the largest element is " + getMaxValue() +
                " at (" + getRow() + ", " + getCol() + ")";

        return output;
    }
}
