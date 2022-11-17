package chapters.chapter_11.exercise_02;

public class Exercise_02 {
    public static void main(String[] args) {
        Person person = new Person("Adam" , "USA" , "123456789", "adam@usa.com");
        Student student = new Student("Zack", "UK", "1223334444","zack@uk.com", Student.FRESHMAN);
        Employee employee = new Employee("Sean" , "tc", "900000001", "sean@tc.com", "izmir", 5000);
        Faculty faculty = new Faculty("Oscar", "Greek" , "26615869", "oscar@greek.com","atina", 5500, 6, 2);
        Staff staff = new Staff("Beatrix", "Poland", "156156", "beatrix@poland.com", "warsaw", 4500, "sales consultant");

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
