package chapters.chapter_10.exercise_14;

public class Exercise_14 {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(34355555133101L);
        System.out.println("myDate1: " + myDate1.toString());
        System.out.println("myDate2: " + myDate2.toString());
        myDate1.setDate(561555550000L);
        System.out.println("Set myDate2: " + myDate1.toString());
    }
}
