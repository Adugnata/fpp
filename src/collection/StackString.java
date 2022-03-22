package collection;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class StackString<Item> {
    private Item[] a;
    private  int size;
    StackString(int n){
        size = 0;
        a = (Item[]) new Object[n];
    }
    public void push(Item item){
        if(a.length-1 == size) resize();
        a[size++] = item;
    }
    public Item pop(){
        if(isEmpty()) throw new NoSuchElementException("Stack under flow");
        Item item = a[--size];
        a[size] = null;
        return item;
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public void resize(){
        a = Arrays.copyOf(a,2*a.length);
    }
public int size(){
        return size;
}
    public static void main(String[] args) {
        StackString<Integer> stackString = new StackString<>(2);
        System.out.println(stackString.isEmpty());
        stackString.push(1);
        stackString.push(2);
        System.out.println(stackString.pop());
    }
}
