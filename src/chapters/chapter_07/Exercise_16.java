package chapters.chapter_07;

public class Exercise_16 {

	public static void main(String[] args) {

		int[] randomIntS = generateRandomInteger(100_000);
		int randomKey = assignRandomKeyValue(randomIntS);

		long startTime = System.currentTimeMillis();
		linearSearch(randomIntS, randomKey);
		long executionTime = System.currentTimeMillis() - startTime;

		System.out.println("Linear search took time: " + executionTime + " ms");

		int[] randomIntS2 = generateRandomInteger(100_000);
		int randomKey2 = assignRandomKeyValue(randomIntS2);

		long startTime2 = System.currentTimeMillis();
		binarySearch(randomIntS2, randomKey2);
		long executionTime2 = System.currentTimeMillis() - startTime2;

		System.out.println("\nBinary search took " + executionTime2 + " ms");

	}

	private static int[] generateRandomInteger(int len) {
		int[] res = new int[len];
		for (int i = 0; i < res.length; i++) {
			res[i] = (int) (1 + Math.random() * 1_000_000);
		}
		return res;
	}

	static int assignRandomKeyValue(int[] list) {
		return list[(int) (1 + Math.random() * 99_999)];
	}

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1;
	}

	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}

}
