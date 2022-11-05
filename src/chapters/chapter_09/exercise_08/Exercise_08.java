package chapters.chapter_09.exercise_08;

public class Exercise_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");
        System.out.println("fan 1\n------------------- \n" + fan1.toString());
        System.out.println("------------------");
        System.out.println("fan 2 \n------------------ \n" + fan2.toString());
    }
}
