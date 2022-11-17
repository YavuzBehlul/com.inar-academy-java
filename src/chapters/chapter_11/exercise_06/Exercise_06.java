package chapters.chapter_11.exercise_06;

import java.util.ArrayList;
import java.util.Date;

public class Exercise_06 {
    public static void main(String[] args) {
        ArrayList<Loan> loanList = new ArrayList<Loan>();
        loanList.add(new Loan(7, 10, 10000));
        loanList.add(new Loan(8, 10, 10000));


        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(new Date());
        dateList.add(new Date(1235678999L));


        ArrayList<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle());
        circleList.add(new Circle(50));

        display(loanList);
        display(dateList);
        display(circleList);

        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add(new Circle(5));
        list.add("java");

        display(list);
    }

    public static void display(ArrayList<?> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println();
        }
        System.out.println("----------------------------------");

    }
}
