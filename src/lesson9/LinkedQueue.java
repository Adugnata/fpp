package lesson9;

public class LinkedQueue {
    Node front, rear;
    int count;

    class Node {
        Object data;
        Node next;

        Node(Object item) {
            data = item;
        }
    }

    public void insert(Object item) {
        Node p = new Node(item);
        if (front == null) {
            front = rear = p;
            front.next = null;
        } else if (front == rear) {
            rear = p;
            front.next = rear;
            rear.next = null;
        } else {
            rear.next = p;
            rear = p;
            rear.next = null;
        }
        count++;
    }

    public Object remove() {
        if (isEmpty()) {
            return null;
        }
        Object item = front.data;
        count--;
        return item;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public Object peek() {
        return front.data;
    }

    public int size() {
        return count;
    }

    public void display() {
        Node p = front;
        System.out.println("Linked Q: ");
        if (p == null) {
            System.out.println("empty");
        }
        while (p != null) {
            System.out.println(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        q.display();
        q.insert('A');
        q.insert('B');
        q.insert('C');
        q.insert('D');
        q.display();
        System.out.println("Remove(): " + q.remove());
        q.display();
        System.out.println("peek(): " + q.peek());
        q.insert('E');
        q.insert('F');
        System.out.println("Remove(): " + q.remove());
        q.display();
        System.out.println("size(): " + q.size());
        System.out.println("isEmpty(): " + q.isEmpty());
        LinkedQueue q1 = new LinkedQueue();
        System.out.println("isEmpty(): " + q1.isEmpty());
    }
}
