package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the list lenght then elements : ");
        int[] list = createList(input.nextInt(), input);

        int indexOfPivotAfterPartition = partition(list);
        System.out.println("Pivot index is " + indexOfPivotAfterPartition);
        display(list);
    }

    public static int partition(int[] list) {
        int pivot = list[0];
        int pivotIndex = 0;
        int low = 1;
        int high = list.length - 1;


        while (low < high) {
            while (pivot > list[low]) {
                int temp = list[low];
                list[low] = list[pivotIndex];
                list[pivotIndex] = temp;
                pivotIndex = low;
                low++;
            }
            while (pivot < list[high]) {
                high--;
            }
            if (high > low) {
                int temp = list[pivotIndex];
                list[pivotIndex] = list[high];
                list[high] = temp;
                temp = list[high];
                list[high] = list[++pivotIndex];
                list[pivotIndex] = temp;
                low = pivotIndex + 1;
            }
        }

        return pivotIndex;
    }

    public static void display(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static int[] createList(int length, Scanner input) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = input.nextInt();
        }
        return result;
    }
}
