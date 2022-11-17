package chapters.chapter_11.exercise_02;

public class Staff extends Employee{
    private String title;

    public Staff() {
        this(null, null, null, null, null, 0, null);
    }

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
