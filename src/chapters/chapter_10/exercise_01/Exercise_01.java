package chapters.chapter_10.exercise_01;

public class Exercise_01 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000);

        displayTimeObject(t1);
        displayTimeObject(t2);
    }

    public static void displayTimeObject(Time t) {

        System.out.println((t.getHour() < 10? "0" + t.getHour() : t.getHour()) + ":" +
                (t.getMinute() < 10 ? "0" + t.getMinute() : t.getMinute()) + ":" +
                (t.getSecond() < 10 ? "0" + t.getSecond() : t.getSecond()));
    }



}
