package chapters.chapter_05;

public class Exercise_12 {

	public static void main(String[] args) {
		int n = 0;

		while (Math.pow(n, 2) < 12000) {
			n++;
		}
		System.out.println("The smallest integer for n = " + n);
		System.out.println("The second force of " + n + " = " + Math.pow(n, 2));
	}

}
