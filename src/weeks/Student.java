package weeks;

public class Student {
    private String name;
    private String surname;
    private int id;
    private String email;


    public Student() {
        this(" ", "", 0, " ");

    }

    public Student(String name, String surname, int id, String email) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print() {
        System.out.println("Name: " + getName() +
                "\nSurname: " + getSurname() +
                "\nId: " + getId() +
                "\nEmail: " + getEmail());
    }
}
