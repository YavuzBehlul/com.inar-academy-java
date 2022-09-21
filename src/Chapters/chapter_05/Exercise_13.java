package chapters.chapter_05;

public class Exercise_13 {

	public static void main(String[] args) {

		int n = 0;

		while (Math.pow(n, 3) < 12000) {

			n++;
		}
		System.out.println("The largest integer for n = " + (n-1));
		System.out.println("The third force of " + (n - 1) + " = " + Math.pow(n - 1, 3));
	}

}
