package chapters.chapter_10.exercise_10;

public class Exercise_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        int size = queue.getSize();
        for (int i = 0; i < size; i++) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }

}
