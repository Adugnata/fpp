package collection;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedStack<Item> {
    private Node top;
    private int size;
    private Item[] a;
    private static class Node<Item>{
        Item item;
        Node next;
        Node(Item item){
            this.item = item;
        }
    }
    LinkedStack(int n){
        top = null;
        size =0;
        a = (Item[]) new Object[n];
    }
    public void push(Item item){
        if(a.length-1 == size) resize();
        Node oldfirst = top;
        Node n = new Node(item);
        top = n;
        top.next = oldfirst;
        size++;

    }
    public Item pop(){
        if(isEmpty()) throw new NoSuchElementException("Stack under flow");
        Item item = (Item) top.item;
        top = top.next;
        size--;
        return item;
    }
    public Item peek(){
        if(isEmpty()) throw new NoSuchElementException("Stack Under Flow");
        return (Item) top.item;

    }
    public int size(){
         return size;
    }
    public boolean isEmpty(){
         return top==null;
    }
    public void resize(){
        a = Arrays.copyOf(a,2 * a.length);
    }

    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<>(2);
        System.out.println(linkedStack.size());
        linkedStack.push("Tesfa");
        linkedStack.push("Michael");
        System.out.println(linkedStack.size());
        linkedStack.push("Amsalu");
        System.out.println(linkedStack.peek());
        System.out.println(linkedStack.size());
        while (!linkedStack.isEmpty())
            System.out.println(linkedStack.pop());
    }
}
