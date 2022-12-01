package chapters.chapter_13.exercise_11;

public class Exercise_11 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Octagon octagon1 = new Octagon(1);

        System.out.print("Area of Octagon1: ");
        System.out.println(octagon1.getArea());

        System.out.println("Cloning the octagon1");
        Octagon octagon2 = (Octagon)octagon1.clone();

        System.out.print("Area of Octagon2: ");
        System.out.println(octagon2.getArea());

        int result = (octagon1.compareTo(octagon2));

        if (result == 1)
            System.out.println("Octagon1 is greater than Octagon2.");
        else if (result == -1)
            System.out.println("Octagon1 is less than Octagon2.");
        else
            System.out.println("Octagon1 is equal to Octagon2.");
    }
}
