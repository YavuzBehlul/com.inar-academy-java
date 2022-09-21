package chapters.chapter_05;

public class Exercise_24 {

	public static void main(String[] args) {
		
		double summution = 0;
		for(double number = 1; number < 100; number += 2) {
			summution += number / (number + 2);
			
		}
		System.out.println("Summution of series: " + summution);

}
}