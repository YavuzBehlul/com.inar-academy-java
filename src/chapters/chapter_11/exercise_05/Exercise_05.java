package chapters.chapter_11.exercise_05;

public class Exercise_05 {
    public static void main(String[] args) {
        Course course = new Course("AI");

        System.out.println("----------------"+course.getCourseName()+"----------------");
        System.out.println();

        course.addStudent("Adam");
        course.addStudent("Arthur");
        course.addStudent("Benedict");
        course.addStudent("Nick");
        course.addStudent("Hector");
        course.addStudent("Lowell");
        course.addStudent("Steve");

        System.out.println("NumberOfStudents: " + course.getNumberOfStudents());
        System.out.println(course.toString());
        System.out.println();

        course.dropStudent("Steve");
        course.dropStudent("Lowell");

        System.out.println("NumberOfStudents: " + course.getNumberOfStudents());
        System.out.println(course.toString());
    }
}
