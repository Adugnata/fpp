package collection;

import java.util.NoSuchElementException;

public class DLinkedList {
    private static class Node {
        private Node previous, next;
        private String value;

        Node(Node p, String v, Node n) {
            previous = p;
            value = v;
            next = n;
        }
    }
    Node header;
    DLinkedList() {
        header = new Node(null, null, null);
    }

    public void addFirst(String item){
        Node n = new Node(header,item,header.next);
        if(header.next != null)
            header.next.previous = n;
        header.next = n;
    }
    String deleteFirst() {
        Node del = header.next;
        if (del == null)
            throw new NoSuchElementException();
        if(del.next==null)
            del.previous.next = null;
        else {
            del.next.previous = del.previous;
            del.previous.next = del.next;
        }
        return del.value;

    }
    public void addLast(String item) {
        Node n = new Node(null, item, null);
        Node temp = header;
        while (temp.next != null)
            temp = temp.next;
        n.previous = temp;
        temp.next = n;
    }

    String deleteLast() {
        Node temp = header.next;
        if (temp == null)
            throw new NoSuchElementException();
        while (temp.next != null)
            temp = temp.next;
        temp.previous.next = null;
        return temp.value;
    }

    public int find(String s) {
        int i = -1;
        if (s == null) return i;
        Node temp = header.next;
        while (temp != null) {
            ++i;
            temp = temp.next;
            if (s.equals(temp.value)) return i;
        }
        return -1;
    }

    public int size() {
        int count = 0;
        Node next = header.next;
        while (next != null) {
            ++count;
            next = next.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return header.next == null || size() == 0;
    }

    void displayNodes() {
        Node temp = header.next;
        if(temp == null) return;
        while (temp.next != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    public static void main(String[] args) {
        DLinkedList dl = new
                DLinkedList();
        dl.addFirst("A");
        System.out.println(dl.deleteLast());
        dl.addLast("B");
        dl.addLast("C");
        dl.displayNodes();


    }
}
