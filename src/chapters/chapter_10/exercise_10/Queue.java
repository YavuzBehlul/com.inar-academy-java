package chapters.chapter_10.exercise_10;

public class Queue {
    private int[] elements;
    private int size;


    public Queue() {
        elements = new int[8];
        size = 0;
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] tempElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, tempElements, 0, elements.length);
            elements = tempElements;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        int e = elements[0];

        for (int i = 1; i < this.size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        return e;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
