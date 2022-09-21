package chapters.chapter_05;

public class Exercise_35 {

	public static void main(String[] args) {
		
		 double summution = 0;
		 
	        for (int i = 1; i < 625; i++) {

	            summution += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));

	        }
	        System.out.println("Summution is " + summution);
	}

}
