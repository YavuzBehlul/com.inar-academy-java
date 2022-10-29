package chapters.chapter_08;

public class Exercise_22 {
    public static void main(String[] args) {
        int[][] array = createRandomArray();
        displayArray(array);

        for (int i = 0; i < array.length; i++) {
            if (evenNumberOfOneInRow(array, i)) {
                System.out.println("Row: " + i + " has even number of 1");
            }
        }

        for (int i = 0; i < array[0].length; i++) {
            if (evenNumberOfOneInColumn(array, i)) {
                System.out.println("Column: " + i + " has even number of 1");
            }
        }
    }

    public static boolean evenNumberOfOneInColumn(int[][] array, int i) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j][i] == 1) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean evenNumberOfOneInRow(int[][] array, int i) {
        int count = 0;
        for (int j = 0; j < array[0].length; j++) {
            if (array[i][j] == 1)
                count++;
        }
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int[][] createRandomArray() {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }
        return array;
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

