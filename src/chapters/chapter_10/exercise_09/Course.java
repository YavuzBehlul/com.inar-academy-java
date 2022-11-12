package chapters.chapter_10.exercise_09;

public class Course {
    private String name;
    private String[] students;
    private int numberOfStudents;

    public Course(String name) {
        this.name = name;
        students = new String[10];
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= student.length()) {
            String[] tempStudentList = new String[students.length * 2];
            System.arraycopy(students, 0, tempStudentList, 0, students.length);
            students = tempStudentList;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;

    }

    // A B D F G H null
    public void dropStudent(String student) {
        int indexOfStudent = findTheSpecifiedStudent(student);
        if (indexOfStudent == -1) {
            System.out.println("There is not any student like " + student);
            return;
        }

        for (int startPoint = indexOfStudent; startPoint < numberOfStudents - 1; startPoint++) {
            students[startPoint] = students[startPoint + 1];
        }
        numberOfStudents--;

    }

    public int findTheSpecifiedStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        students = new String[10];
        numberOfStudents = 0;
    }

    public void displayStudents() {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i]);
        }
    }

}
