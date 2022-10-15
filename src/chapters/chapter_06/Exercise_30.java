package chapters.chapter_06;

public class Exercise_30 {

	public static void main(String[] args) {
		int point = 0;
		System.out.println("*** Game Craps ****\n...rolling the dice...\n");

		int rolled1 = rolledDice1();
		int rolled2 = rolledDice2();
		int rolledSum = rolled1 + rolled2;

		String result = checkResult(rolledSum);

		if (result == "craps") {
			System.out.println("You rolled a " + rolled1 + " + " + rolled2 + " = " + rolledSum + "CRAPS");

		} else if (result == "point") {

			point = rolledSum;
			System.out.println("You rolled " + rolled1 + " + " + rolled2 + " = " + rolledSum
					+ ".\nPoint is established as " + rolledSum + ". Rolling again...");

			int rolleAgain = 0;

			while (rolleAgain != 7) {

				int rolleAgainDice1 = rolledDice1();
				int rolleAgainDice2 = rolledDice2();

				rolleAgain = rolleAgainDice1 + rolleAgainDice2;

				System.out.println("You rolled " + rolleAgainDice1 + " + " + rolleAgainDice2 + " = " + rolleAgain);

				if (rolleAgain == point) {

					System.out.println("You Win!");
					break;
				} else if (rolleAgain == 7) { // for the first possibility
					System.out.println("You loose!");
					break;
				}
			}

		} else if (result == "natural") {
			System.out.println("Natural! You rolled a " + rolled1 + " + " + rolled2 + " = " + rolledSum + " You win!");
		}

	}

	public static int rolledDice1() {
		return (int) (1 + Math.random() * 6);
	}

	public static int rolledDice2() {
		return (int) (1 + Math.random() * 6);

	}

	public static String checkResult(int rolledSum) {

		if (rolledSum == 2 || rolledSum == 3 || rolledSum == 12) {
			return "craps";

		} else if (rolledSum == 7 || rolledSum == 11) {
			return "natural";
		}
		return "point";

	}

}
