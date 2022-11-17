package chapters.chapter_11.exercise_10;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack myStack = new MyStack();

        System.out.print("Enter a String : ");

        for (int i = 0; i < 5; i++) {

            String s = input.nextLine();
            myStack.push(s);
        }
        System.out.println("Stack size: " + myStack.size());
        System.out.println(myStack.toString());

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
        System.out.println("Stack size:" + myStack.size());
        System.out.println(myStack.toString());
    }
}
