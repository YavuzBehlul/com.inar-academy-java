package chapters.chapter_05;

public class Exercise_43 {

	public static void main(String[] args) {

        int count = 0;
        for (int row = 1; row < 7; row++) {
        	
            for (int column = row + 1; column <= 7; column++) {
            	
                System.out.println(row + " " + column);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);
	}

}
