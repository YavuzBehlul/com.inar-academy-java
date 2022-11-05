package chapters.chapter_09.exercise_05;

import java.util.GregorianCalendar;

public class Exercise_05 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month =calendar.get(GregorianCalendar.MONTH);
        int dayOfMonth =calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println(year + "/" + month + "/" + dayOfMonth);

        calendar.setTimeInMillis(1234567898765L);
        int year_2 = calendar.get(GregorianCalendar.YEAR);
        int month_2 =calendar.get(GregorianCalendar.MONTH);
        int dayOfMonth_2 =calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println(year_2 + "/" + month_2 + "/" + dayOfMonth_2);
    }
}
