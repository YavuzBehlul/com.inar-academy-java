package chapters.chapter_05;



public class Exercise_19 {

	public static void main(String[] args) {
		
		int high = 0, low = 7;
		
        for (int i = 1; i <= 128; i *= 2) {
        	
            for (int space = 0; space < low; space++) {
                System.out.print("    ");
            }
            for (int j = 1 ; j <= i; j += j) {
                System.out.printf("%4d", (j));
            }
            for (int k = high ; k > 0; k /= 2) {
                System.out.printf("%4d", (k));
            }
            high = i;
            low--;
            System.out.println();
        }
			
		
	}

}