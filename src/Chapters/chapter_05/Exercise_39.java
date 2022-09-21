package chapters.chapter_05;

public class Exercise_39 {

	public static void main(String[] args) {

		double salaryGoal = 30_000;
		double salaryCurrent = 5_000 + (5_000 * (8.0 / 100)) + (5_000 * (10.0 / 100));
		double sales = 10_000.01;

		while (salaryCurrent < salaryGoal) {

			sales += 100;
			salaryCurrent += (100 * (12.0 / 100));

		}
		System.out.printf("You have to sell $" + sales + " item to earn $30_000.");

	}

}
