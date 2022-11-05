package chapters.chapter_09.exercise_09;

public class Exercise_09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon_1 = new RegularPolygon();
        RegularPolygon regularPolygon_2 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon_3 = new RegularPolygon(10,4, 5.6, 7.8);

        System.out.println("regularPolygon_1 perimeter: " + regularPolygon_1.getPerimeter() +
                "  Area: " + regularPolygon_1.getArea());
        System.out.println("regularPolygon_2 perimeter: " + regularPolygon_2.getPerimeter() +
                "  Area: " + regularPolygon_2.getArea());
        System.out.println("regularPolygon_3 perimeter: " + regularPolygon_3.getPerimeter() +
                "  Area: " + regularPolygon_3.getArea());
    }
}
