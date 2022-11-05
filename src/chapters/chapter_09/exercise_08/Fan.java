package chapters.chapter_09.exercise_08;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        switch (speed) {
            case 1:
                this.speed = SLOW;
                break;
            case 2:
                this.speed = MEDIUM;
                break;
            case 3:
                this.speed = FAST;
                break;
            default:
                System.out.println("Invalid speed");
                System.exit(1);
        }

        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 3 && speed < 1) {
            System.out.println("Invalid speed");
            System.exit(2);
        }
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius();
        } else {
            return "Color: " + getColor() + "\nRadius: " + getRadius() + "\nfan is off";
        }
    }
}
