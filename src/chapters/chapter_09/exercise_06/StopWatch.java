package chapters.chapter_09.exercise_06;

public class StopWatch {
    private long startTime;
    private long endTime;


    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        return (getEndTime() - getStartTime());
    }
}
