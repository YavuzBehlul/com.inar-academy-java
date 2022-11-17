package chapters.chapter_11.exercise_05;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String name) {
        if(!students.remove(name)) {
            System.out.println(name + " is not in the course");
        }
    }

    public String toString() {
        return students.toString();
    }
}
