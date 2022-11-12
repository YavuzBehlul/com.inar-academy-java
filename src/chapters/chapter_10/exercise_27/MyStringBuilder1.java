package chapters.chapter_10.exercise_27;

public class MyStringBuilder1 {
    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        this.s = this.s + s.toString();
        return this;
    }

    public MyStringBuilder1 append(int i) {
        this.s = this.s + i;
        return this;
    }
    public int length() {
        return this.s.length();
    }

    public char charAt(int index) {
        return this.s.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        String s1 = "";
        for (int i = 0; i < this.s.length(); i++) {
            if(this.s.charAt(i) >= 'A' && this.s.charAt(i) <= 'Z') {
                char ch = (char)(s.charAt(i) - ('A' - 'a'));
                s1 += ch;
            } else {
                s1 += this.s.charAt(i);
            }
        }
        this.s = s1;
        return this;

       /* this.s = s.toLowerCase();
        return this;*/
    }

    public MyStringBuilder1 substring(int begin, int end) {
        /*String s1 = "";
        for (int i = begin; i < end; i++) {
            s1 += this.s.charAt(i);
        }
        this.s = s1;
        return this;*/

        this.s = this.s.substring(begin, end);
        return this;
    }

    public String toString() {
        return this.s;
    }
}
