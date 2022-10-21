package chapters.chapter_08;

public class Exercise_10 {
    public static void main(String[] args) {


        int[][] randomMatrix = new int[4][4];

        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[i].length; j++) {
                randomMatrix[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[i].length; j++) {
                System.out.print(randomMatrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("The largest row index: " +
                toFindLargestRow(randomMatrix));

        System.out.println("The largest column index: " +
                toFindLargestColumn(randomMatrix));


    }

    public static int toFindLargestColumn(int[][] arr) {

        int largestCol = 0;
        int largestSum = arr[0][0] + arr[1][0] + arr[2][0] + arr[3][0];
        int sum = 0;

        for (int i = 1; i < arr[0].length; i++) {

            sum = arr[0][i] + arr[1][i] + arr[2][i] + arr[3][i];
            if (sum > largestSum) {
                largestSum = sum;
                largestCol = i;
            }
        }
        return largestCol;

    }

    public static int toFindLargestRow(int[][] arr) {

        int largestRow = 0;
        int largeSum = arr[0][0] + arr[0][1] + arr[0][2] + arr[0][3];
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {

            sum = arr[i][0] + arr[i][1] + arr[i][2] + arr[i][3];
            if (sum > largeSum) {
                largeSum = sum;
                largestRow = i;
            }

        }

        return largestRow;
    }
}
