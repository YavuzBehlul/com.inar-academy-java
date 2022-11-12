package chapters.chapter_10.exercise_06;

public class Exercise_06 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        int number = 2;
        while (number < 120) {
            if (isPrime(number)) {
                stack.push(number);
            }
            number++;
        }
        display(stack);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void display(StackOfIntegers stack) {
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
