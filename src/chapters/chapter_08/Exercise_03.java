package chapters.chapter_08;

public class Exercise_03 {
    public static void main(String[] args) {

        char[][] answers = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};


        int[][] scoresArr = new int[answers.length][2];

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;

            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }

                scoresArr[i][0] = correctCount;
                scoresArr[i][1] = i;
            }
        }


        for (int i = 0; i < scoresArr.length - 1; i++) {

            for (int j = i + 1; j < scoresArr.length; j++) {
                if (scoresArr[j][0] < scoresArr[i][0]) {
                    int[] temp = scoresArr[i];
                    scoresArr[i] = scoresArr[j];
                    scoresArr[j] = temp;
                }
            }

        }

        for (int a = 0; a < scoresArr.length; a++) {
            System.out.println("Student " +
                    scoresArr[a][1] + "'s correct count is: " + scoresArr[a][0]);
        }

    }
}
