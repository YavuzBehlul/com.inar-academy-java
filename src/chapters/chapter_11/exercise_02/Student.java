package chapters.chapter_11.exercise_02;

public class Student extends Person{
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student() {
        this(null, null, null, null, null);
    }

    public Student(String name, String addres, String phoneNumber, String email, String status) {
        super(name, addres, phoneNumber, email);
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStatus : " + this.status;
    }
}
