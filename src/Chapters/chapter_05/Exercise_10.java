package chapters.chapter_05;

public class Exercise_10 {

	public static void main(String[] args) {
		
		final int startNumber = 100;
        final int endNumber = 1000;

        int count = 0;
        for (int i = startNumber; i < endNumber; i++) {

            if (i % 6 == 0 && i % 5 == 0) {
                System.out.print(i + "  ,  ");
                count++;

                if (count == 10) {
                    System.out.print("\n");
                    count = 0;
                }

            }

        }

	}

}
