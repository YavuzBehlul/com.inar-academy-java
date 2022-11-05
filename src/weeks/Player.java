package weeks;

public class Player {
    private String name;
    private double fee;

    public Player() {
        this("default", 0);
    }

    public Player(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void increase(double value) {
        setFee(getFee() + value);
    }

    public void decrease(double value) {
        if (getFee() - value < 0)
            setFee(0);
        else
            setFee(getFee() - value);
    }
}
