package chapters.chapter_05;

public class Exercise_23 {

	public static void main(String[] args) {
		
		double summationRtoL = 0.0;
		
        for (int i = 50000; i >= 1; i--) {
        	
            summationRtoL += 1.0 / i;
        }
        System.out.println("Result of the summation of the series from right to left was " + summationRtoL);

        double summutionLtoR = 0.0;
        
        for (int i = 1; i < 50000; i++) {
        	
            summutionLtoR += 1.0 / i;
        }
        System.out.println("Result of the summation of the series from left to right was " + summutionLtoR);

	}

}
