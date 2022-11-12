package chapters.chapter_10.exercise_03;

public class MyInteger {
    private int value;

    public MyInteger() {
        this(0);
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return this.value % 2 != 0;
    }

    public boolean isPrime() {
        for (int i = 2; i < this.value / 2; i++) {
            if (this.value % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }
    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0)
                return false;
        }
        return true;
    }

    public static int parseInt(char[] arr) {
        int sum = 0;
        int pow = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!Character.isDigit(arr[i])) {
                System.out.println("All the characters in the array needs to be a numeric type!");
                System.exit(1);
            }
            sum += (arr[i] - '0') * Math.pow(10, pow++);
        }
        return sum;
    }

    /**public static int parseInt(String number) {
        return parseInt(number.toCharArray());
    }*/

    public boolean equals(int value) {
        return getValue() == value;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(MyInteger myInteger) {
        return myInteger.value == this.value;
    }


    public static int parseInt(String str) {
        int value = 0;
        for (int i = 0, j = (int)Math.pow(10, str.length() - 1);
             i < str.length(); i++, j /= 10) {
            value += (str.charAt(i) - 48) * j;
        }
        return value;
    }
}
