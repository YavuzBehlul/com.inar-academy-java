package chapters.chapter_06;

public class Exercise_12 {

	public static void main(String[] args) {
		printChars('1', 'Z', 10);

	}

	public static void printChars(char char1, char char2, int numberPerLine) {
		int count = numberPerLine;
		while (char1 <= char2) {
			System.out.print(char1 + " ");
			char1++;
			count--;
			if (count == 0) {
				System.out.println();
				count = numberPerLine;
			}

		}
	}
}
