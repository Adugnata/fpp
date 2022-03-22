package lesson9.prob1;

import java.util.*;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;
    private int size = 0;

    public int peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        int temp = arr[++front];
        front--;
        return temp;
    }

    public void enqueue(int obj) {
        if (arr.length - 1 == rear) reszie();

        arr[rear++] = obj;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        size--;
        return arr[++front];

    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public int size() {
        return size;
    }

    public void reszie() {
        arr = Arrays.copyOf(arr, arr.length * 2);
    }
    public static void main(String[] args) {
        ArrayQueueImpl aq = new ArrayQueueImpl();

        for (int j = 1; j <= 5; j++) {
            aq.enqueue(j );
        }
        while (!aq.isEmpty())
        {
            System.out.println(aq.dequeue());
        }
    }
}


