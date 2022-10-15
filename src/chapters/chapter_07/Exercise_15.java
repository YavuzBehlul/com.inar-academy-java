package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numberS = new int[10];

		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			numberS[i] = input.nextInt();

		}

		int[] resultArray = eliminateDuplicates(numberS);

		System.out.print("The distinct integers are: ");

		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}
		input.close();
	}

	public static int[] eliminateDuplicates(int[] list) {
		int[] list2 = new int[list.length];
		int index = 0;
		boolean flag = true;

		for (int i = 0; i < list.length; i++) {
			flag = true;

			for (int j = 0; j < list.length; j++) {
				if (list2[j] == list[i]) {
					flag = false;
				}
			}
			if (flag) {

				list2[index++] = list[i]; // once işlem yap sonra arttır diger hicbiryontem olmuyor

			}
		}

		int[] resultArray = new int[index]; // sıfırlardan kurtulmaca
		for (int i = 0; i < index; i++) {
			resultArray[i] = list2[i];
		}

		return resultArray;

	}
}
