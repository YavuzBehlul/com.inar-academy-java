package chapters.chapter_13.exercise_05;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated +
                "\nColor: " + color +
                "\nFilled: " + filled;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
