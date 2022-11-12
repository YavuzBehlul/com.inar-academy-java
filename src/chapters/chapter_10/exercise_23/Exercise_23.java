package chapters.chapter_10.exercise_23;

public class Exercise_23 {
    public static void main(String[] args) {
        MyString2 str1 = new MyString2("java");
        MyString2 str2 = new MyString2("javascript");


        System.out.println("Compare str1 to ''java'' :");
        System.out.println(str1.compare("java"));


        System.out.println("Display a substring str2 at index 5: ");
        print(str2.substring(5));

        // Test toUpperCase()
        System.out.println("Convert str2 to upper case: ");
        print(str2.toUpperCase());


        System.out.println("Display the boolean value true: ");
        print(MyString2.valueOf(true));
    }

    public static void print(MyString2 str) {
        print(str.toChars());
    }

    public static void print(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
