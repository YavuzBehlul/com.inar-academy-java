package chapters.chapter_07;

public class Exercise_13 {

	public static void main(String[] args) {

		System.out.println("Random number is: " + getRandom());

	}

	public static int getRandom(int... numbers) {

		int randomInt = (int) (1 + Math.random() * 54);

		for (int e : numbers) {
			if (randomInt == e) {
				return getRandom(numbers);
			}
		}
		return randomInt;

	}
}
