package chapters.chapter_06;

public class Exercise_09 {

	public static void main(String[] args) {
		System.out.println("Feet            Meters        |          Meters        Feet");
		System.out.println("--------------------------------------------------------------");
		
		for (int ft = 1, mtr = 20; ft <= 10; ft++, mtr += 5) { 
			double feet = ft; 
			double meters = mtr; 
			
			System.out.printf("%-15.1f%-15.3f", feet, footToMeter(feet));
			
			System.out.printf("|%15.1f%15.3f\n", meters, meterToFoot(meters));

		}

	}

	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}
}
