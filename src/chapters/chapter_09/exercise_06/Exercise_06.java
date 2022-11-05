package chapters.chapter_09.exercise_06;

public class Exercise_06 {
    public static void main(String[] args) {

        int[] array = createArray(100_000);

        StopWatch time = new StopWatch();
        time.start();
        sort(array);
        time.stop();
        System.out.println("Array sorted in " + (time.getElapsedTime() / 1_000) + " seconds");

    }

    public static int[] createArray(int range) {
        int[] result = new int[range];

        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * range);
        }
        return result;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < currentMin) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }

            if (i != currentMinIndex) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }
}
