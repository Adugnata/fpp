package lesson9.prob2;

import java.util.Arrays;
import java.util.NoSuchElementException;

interface stack1 {
    void push(Object ob);

    Object pop();

    Object peek();

    boolean isEmpty();

    int size();

    void resize();
}

public class StackLinkedlistImpl implements stack1{
    private Object a[];
    private Node top;
    private int size;

    private static class Node {
        private Node next;
        private Object item;
    }

    StackLinkedlistImpl(int n) {
        a = new Object[n];
        top = null;
        size = 0;
    }

    @Override
    public void push(Object ob) {
        if (size == a.length - 1) resize();
        Node oldfirst = top;
        top = new Node();
        top.item = ob;
        top.next = oldfirst;
        size++;
    }

    @Override
    public Object pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Object item = top.item;
        top = top.next;
        size--;
        return item;
    }

    @Override
    public Object peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return top.item;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void resize() {
        a = Arrays.copyOf(a, a.length * 2);
    }

    public static void main(String[] args) {
        StackLinkedlistImpl sl = new StackLinkedlistImpl(2);
        for (int i = 1; i <= 3; i++) {
            sl.push(i);
        }
        sl.push("C++");
        sl.push("Java");
        sl.push("Python");
        System.out.println("size = " + sl.size());
        while (!sl.isEmpty()) {
            System.out.println(sl.pop());
        }
        System.out.println("size = " + sl.size());
    }
}
