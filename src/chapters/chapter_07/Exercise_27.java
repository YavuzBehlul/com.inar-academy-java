package chapters.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter length of list: ");
        int length = input.nextInt();

        int[] list1 = new int[length];
        System.out.println("Enter the list1: ");
        
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        
        int[] list2 = new int[length];
        System.out.println("Enter the list2: ");
        
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        input.close();

        if (equals(list1, list2)) {
            System.out.println("Two lists are identical.");
        } else {
            System.out.println("Two lists are not identical.");
        }
        
    }

    public static boolean equals(int[] list1, int[] list2) {
    	boolean equalsFlag = true;
    	
        Arrays.sort(list1);
        Arrays.sort(list2);

        
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                equalsFlag = false;
            }
        }
        return equalsFlag;
	}

}
