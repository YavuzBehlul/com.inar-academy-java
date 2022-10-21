package chapters.chapter_07;

public class Exercise_20 {
    public static void main(String[] args) {
        double[] array = createRandomDoubleArray(10);
        selectionSort(array);
        displayArray(array);
    }

    public static double[] createRandomDoubleArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
        }
        return array;
    }

    public static void selectionSort(double[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            double max = array[i];
            int maxIndex = i;
            for (int j = 0; j < i; j++) {
                if (max < array[j]) {
                    max = array[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                double temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
    }

    public static void displayArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f  ", array[i]);
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
