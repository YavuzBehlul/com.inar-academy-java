package chapters.chapter_11.exercise_02;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Sinan" , "Sakarya" , "165812", "Sinan@Person.com");
        Student student = new Student("Ali", "Ankara", "0465189","Ali@Student.com", Student.FRESHMAN);
        Employee employee = new Employee("Kemal" , "Istanbul", "18156189", "Kemal@Employee", "Ankara Organize", 5000);
        Faculty faculty = new Faculty("Ayse", "Kahramanmaras" , "26615869", "Ayse@Faculty","Kahramanmaras Uni", 5500, 6, 2);
        Staff staff = new Staff("Fatme", "Bursa", "156156", "Fatma@Staff.com", "Bursa is hani", 4500, "sales consultant");

        display(person);
        display(student);
        display(employee);
        display(faculty);
        display(staff);
    }

    public static void display(Person object) {
        System.out.println(object.toString() + "\n----------------------");

    }
}
