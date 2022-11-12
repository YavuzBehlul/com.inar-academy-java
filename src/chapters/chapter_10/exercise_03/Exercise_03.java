package chapters.chapter_10.exercise_03;

import static chapters.chapter_10.exercise_03.MyInteger.parseInt;

public class Exercise_03 {
    public static void main(String[] args) {
        MyInteger myInteger1 = new MyInteger(111);

        System.out.println(myInteger1.getValue());
        System.out.println("isEven: " + myInteger1.isEven());
        System.out.println("isOdd: " + myInteger1.isOdd());
        System.out.println("isPrime: " + myInteger1.isPrime());

        MyInteger myInteger2 = new MyInteger(222);

        System.out.println(myInteger2.getValue());
        System.out.println("isEven: " + myInteger2.isEven());
        System.out.println("isOdd: " + myInteger2.isOdd());
        System.out.println("isPrime: " + myInteger2.isPrime());

        char[] arr1 = {'1', '2', '3'};
        int number1 = parseInt(arr1);
        System.out.println(number1);

        String number = "12316";
        int number2 = parseInt(number);
        System.out.println(number2);

        System.out.println(new MyInteger(12).equals(12));
        System.out.println(new MyInteger(12).equals(13));

        System.out.println(MyInteger.isPrime(new MyInteger(13)));
        System.out.println(MyInteger.isPrime(new MyInteger(14)));

        System.out.println(MyInteger.isEven(new MyInteger(12)));
        System.out.println(MyInteger.isEven(new MyInteger(13)));

        System.out.println(MyInteger.isOdd(new MyInteger(12)));
        System.out.println(MyInteger.isOdd(new MyInteger(13)));



    }
}
