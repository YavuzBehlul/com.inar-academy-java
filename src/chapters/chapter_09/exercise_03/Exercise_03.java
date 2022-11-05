package chapters.chapter_09.exercise_03;

import java.util.Date;

public class Exercise_03 {
    public static void main(String[] args) {
        long startOfTime = 10000;
//      long finisOfTime = 100000000000L;


        for (int i = 0; i < 8; i++) {
            Date date = new Date(startOfTime);
            System.out.println(date.toString());
            startOfTime *= 10;
        }


    }
}

