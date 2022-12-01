package chapters.chapter_13.exercise_08;

public class Exercise_08 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack stack1 = new MyStack();

        stack1.push(new Integer(1));
        stack1.push(new Double(2));
        stack1.push(new Float(3));

        System.out.println("Cloning");
        //Because clone return to ArrayList<Object>
        MyStack stack2 = (MyStack)stack1.clone();

        System.out.println("Popping object from stack1 Float(3)");
        stack1.pop();

        System.out.println("Pushing object to stack2 Character('A'), new Boolean(true)");
        stack2.push(new Character('A'));
        stack2.push(new Boolean(true));

        System.out.print("Stack 1st ");
        System.out.println(stack1);
        System.out.print("Stack 2nd ");
        System.out.println(stack2);

    }
}
