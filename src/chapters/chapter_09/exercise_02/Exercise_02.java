package chapters.chapter_09.exercise_02;

public class Exercise_02 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.println("Stock price-change percentage: " + stock1.getChangePercent());
    }
}
