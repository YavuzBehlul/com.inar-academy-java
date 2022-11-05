package chapters.chapter_09.exercise_02;

public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this(symbol, name);
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return currentPrice / previousClosingPrice;
    }
}
