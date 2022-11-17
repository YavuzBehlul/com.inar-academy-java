package weeks;

public class Car extends Vehicle{
    public static final int NUMBER_OF_WHEEL = 4;
    private String plaka = "";
    private String marka;

    public Car() {
        this(true, 2, 1000, "White", "54 SC 4240", "TOFAS");
    }

    public Car(boolean hasEngine, int numberOfPassenger, double weight, String color,String plaka, String marka) {
        super(hasEngine, numberOfPassenger, weight, plaka, NUMBER_OF_WHEEL);
        this.plaka = plaka;
        this.marka = marka;
    }
    @Override
    public void goes() {
        System.out.println("Car is on the road right now!!!!");
    }

    public String getPlaka() {
        return this.plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return this.marka;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPlaka : " + this.plaka +
                "\nMarka : " + this.marka;
    }
}

