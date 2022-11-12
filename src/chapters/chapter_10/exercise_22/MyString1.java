package chapters.chapter_10.exercise_22;

public class MyString1 {  //"Sinan's solution": ybe
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (!(begin > 0 && begin < length() - 1) && (end > 0 && end <= length()) && (begin < end)) {

            System.out.println("Invalid input ! ");
            System.exit(-1);
        }

        char[] newArray = new char[end - begin];        // o g u z h a n  ---- g u z

        for (int newIndex = 0, oldIndex = begin; newIndex < newArray.length; newIndex++, oldIndex++) {
            newArray[newIndex] = charAt(oldIndex);
        }
        return new MyString1(newArray);
    }

    public MyString1 toLowerCase() { // o G u Z H A n

        char[] ch = new char[length()];

        for (int i = 0; i < length(); i++) {
            if (chars[i] <= 'Z' && chars[i] >= 'A') {
                ch[i] = (char) (charAt(i) + ('a' - 'A'));
            } else {
                ch[i] = charAt(i);
            }
        }
        return new MyString1(ch);

    }

    public boolean equals(MyString1 str) { // oguz  han
        if (length() != str.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) { // 234    (char)('0' + i % 10)

        int counter = 0;
        int number = i;

        while (number > 0) {
            number /= 10;
            counter++;
        }
        char[] ch = new char[counter];

        for (int j = counter - 1; j >= 0; j--) {

            ch[j] = (char) ('0' + i % 10);
            i /= 10;
        }
        return new MyString1(ch);

    }

}
