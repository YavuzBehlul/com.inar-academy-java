package chapters.chapter_13.exercise_06;

public class Exercise_06 {
    public static void main(String[] args) {

        ComparableCircle cc1 = new ComparableCircle(11);
        ComparableCircle cc2 = new ComparableCircle(11.1);

        System.out.println("\nArea of Circle1:");
        System.out.println(cc1.getArea());

        System.out.println("\nArea of Circle2:");
        System.out.println(cc2.getArea());

        System.out.println((cc1.compareTo(cc2) == 1
                ? "\nCircle1 " : "\nCircle2 ") +
                "is the largest circle.");
    }
}
