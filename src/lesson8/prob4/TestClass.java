package lesson8.prob4;

import java.util.LinkedList;

class Node {
    Node prev;
    int data;
    Node next;

    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public Node() {
        this.prev = null;
        this.data = 0;
        this.next = null;
    }

    @Override
    public String toString() {
        return data + " ";
    }
}

public class TestClass {
    public static void main(String[] args) {
        // create a header node hd and assign data value 10
        Node hd = new Node();
        hd.data = 10;
        System.out.println(hd);
        Node n1 = new Node();
        n1.data = 20;

        // Connection
        hd.next = n1;
        n1.prev = hd;

        System.out.println(hd.next);
        System.out.println(n1.prev);

        Node n2 = new Node();
        n1.next = n2;
        n2.data = 30;
        n2.prev = n1;

        Node n3 = new Node();
        n2.next = n3;
        n3.data = 40;
        n3.prev = n2;
        int sum = 0;
        for (Node i = hd; i != null; i = i.next) {
            sum += i.data;
        }
        System.out.println("Sum of DLL data " + sum);
        Node i = hd;
        int s = 0;
        while (i != null) {
            s += i.data;
            i = i.next;
        }
        System.out.println("Sum of DLL data " + s);
        System.out.println(hd.next.prev);

    }

}
