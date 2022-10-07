package chapters.chapter_06;

public class Exercise_32 {

	static int wins = 0;

	public static void main(String[] args) {
		
		startGames(10000);
		System.out.println("Played 10,000 games of craps and won " + wins + " times.");

	}

	public static int rolledDice1() {
		return (int) (1 + Math.random() * 6);
	}

	public static int rolledDice2() {
		return (int) (1 + Math.random() * 6);

	}

	public static void startGames(int iterations) {

		for (int i = 0; i < iterations; i++) {
			int point = 0;
			int rolled = rolledDice1() + rolledDice2();
			String result = checkResult(rolled);

			if (result =="point") {
				point = rolled;
				int rolling = 0;
				while (rolling != 7) {
					rolling = rolledDice1() + rolledDice2();

					if (rolling == point) {
						wins++;
						break;
					} else if (rolling == 7) {
						break;
					}
				}

			} else if (result == "natural") {
				wins++;
			}
		}
	}

	public static String checkResult(int roll) {
		if (roll == 2 || roll == 3 || roll == 12) {
			return "craps";
		} else if (roll == 7 || roll == 11) {
			return "natural";
		}
		return "point";

	}

}
