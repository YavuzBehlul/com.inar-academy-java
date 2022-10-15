package chapters.chapter_06;

public class Exercise_11 {

	public static void main(String[] args) {
		
		System.out.println("Sales       Commission Amount");
		System.out.println("-----------------------------");
		
		for (int sales = 10_000; sales <= 100_000; sales += 5_000) {
			System.out.printf("%-12d",sales);			
			System.out.printf("%.1f\n", computeCommission(sales));
		}

	}

	public static double computeCommission(double salesAmount) {
		double commission = 0;
		if (salesAmount <= 5000) {
			commission = salesAmount * 0.08;

		} else if (salesAmount <= 10000) {
			salesAmount -= 5000;
			commission = (5000 * 0.08) + (salesAmount * 0.10);

		} else if (salesAmount > 10000) {
			commission = (5000 * 0.08);
			salesAmount -= 5000;

			commission += (5000 * .10);
			salesAmount -= 5000;

			commission += salesAmount * 0.12;
		}
		return commission;
	}
}
