package collection;

import java.util.*;

public class LinkedQueuee {
    private Node front, rear;
    private int n;

    private static class Node {
        private Node next;
        private String item;

        Node(String item) {
            this.item = item;
        }
    }

    LinkedQueuee() {
        rear = null;
        n = 0;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void push(String item) {
        Node oldrear = rear;
        rear = new Node(item);
        rear.next = null;
        if (isEmpty()) front = rear;
        else oldrear.next = rear;
        n++;
    }

    public String pop() {
        if (isEmpty()) throw new NoSuchElementException("under flow");
        String item = front.item;
        front = front.next;
        if (isEmpty()) rear = null;
        n--;
        return item;
    }

    public String peek() {
        if (isEmpty()) throw new NoSuchElementException("under flow");
        return front.item;
    }

    public static void main(String[] args) {
        LinkedQueuee linkedQueue = new LinkedQueuee();
        System.out.println(linkedQueue.front);
        linkedQueue.push("Tesfa");
        linkedQueue.push("Amsalu");
        linkedQueue.push("Adugna");

    }
}

