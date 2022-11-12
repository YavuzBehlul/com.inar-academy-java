package chapters.chapter_10.exercise_01;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        //  setTime(elapsedTime);    ?????

        this((int) (elapsedTime / (60 * 60 * 1000) % 24), (int) (elapsedTime / (60 * 1000) % 60),
                (int) (elapsedTime / 1000 % 60));
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        hour = (int) (elapsedTime / 60 * 60 * 1000 % 24);
        minute = (int) (elapsedTime / 60 * 1000 % 60);
        second = (int) (elapsedTime / 1000 % 60);

    }
}
