package weeks;

public class Vehicle {
    public static final int MIN_PASSENGER_NUMBER = 1;
    protected boolean hasEngine;
    protected int numberOfPassenger;
    protected double weight;
    protected String color;
    protected int numberOfWheel;

    public Vehicle() {
        this(false, MIN_PASSENGER_NUMBER, 0, null, 0);
    }

    public Vehicle(boolean hasEngine, int numberOfPassenger, double weight, String color, int numberOfWheel) {
        this.hasEngine = hasEngine;
        this.numberOfPassenger = numberOfPassenger;
        this.weight = weight;
        this.color = color;
        this.numberOfWheel = numberOfWheel;
    }

    public boolean isHasEngine() {
        return this.hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public int getNumberOfPassenger() {
        return this.numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheel() {
        return this.numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    final public void purpose() {
        System.out.println("Use to transport!!");
    }

    public void goes() {
        System.out.println("Vehicle is on the road right now!!!!");
    }

    @Override
    public String toString() {
        return "hasEngine : " + this.hasEngine +
                "\nNumber of passenger : " + this.numberOfPassenger +
                "\nWeight : " + this.weight +
                "\nColor : " + this.color +
                "\nNumber of wheel : " + this.getNumberOfWheel();
    }


}