package chapters.chapter_12.exercise_01;

public class Exercise_01 {
    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("Usage: java operand1 operator operand2");
            System.exit(1);
        }

        try {
            switch (args[1].charAt(0)) {
                case '+':
                    args[3] = Integer.parseInt(args[0]) + Integer.parseInt(args[2]) + "";
                case '-':
                    args[3] = Integer.parseInt(args[0]) - Integer.parseInt(args[2]) + "";
                case '*':
                    args[3] = Integer.parseInt(args[0]) * Integer.parseInt(args[2]) + "";
                case '/':
                    args[3] = Integer.parseInt(args[0]) / Integer.parseInt(args[2]) + "";
            }
        } catch (NumberFormatException ex) {
            System.out.println("Wrong input: " + args[0] + args[1] + args[2]);
        }
    }
}
