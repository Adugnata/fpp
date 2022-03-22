package collection;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private class Node {
        Node prev, next;
        String data;

        Node(String data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }
        Node head;
    DoublyLinkedList(){
       head = new Node(null);

    }
    void addlast(String data) {
        Node n = new Node(data);
        if (head == null)
            head = n;
        else {
            Node curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = n;
            n.prev = curr;

        }
    }
    void addfirst(String data){
            Node n = new Node(data);
            if(head == null) {

                head = n;
            }
            else {
                n.next = head;
                head.prev = n;
                head = n;
            }
    }
    Node deleteLast(){
            Node delete = head;
            if(head == null || head.next ==null)
            {
                head = null;
                return delete;
            }
            while (delete.next !=null)
                delete = delete.next;
            return delete.prev.next = null;
    }
    String deleteFirst(){
            Node del = head;
        if (del == null)
            throw new NoSuchElementException();
        else {
            head = head.next;
            head.prev = null;
            return del.data;
        }

    }
    public int find(String s) {
        if (s == null) return -1;
        Node cn = head;
        int i = -1;
        while (cn.next != null) {
            ++i;
            cn = cn.next;
            if (s.equals(cn.data)) return i;
        }
        return -1;
    }

    public int size() {
        int count = 0;
        Node next = head.next;
        while (next != null) {
            ++count;
            next = next.next;
        }
        return count;
    }

    public boolean isEmpty() {
        if (head.next == null || size() == 0)
            return true;
        else return false;
    }

    void displayNodes() {
            Node n = head.next;
        while (n.next != null) {
            System.out.print(n.data+ "-->");
            n = n.next;
        }
        System.out.println(n.data);
    }
    public static void main(String[] args) {
            DoublyLinkedList d = new DoublyLinkedList();
        d.addfirst("A");
        d.addfirst("B");
        d.addfirst("C");
        d.displayNodes();

    }
}
