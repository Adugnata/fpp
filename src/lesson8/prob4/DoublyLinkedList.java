package lesson8.prob4;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    public void addLast(String item) {
        Node n = new Node();
        n.value = item;
        Node temp = header;
        while (temp.next != null)
                temp = temp.next;
        n.previous = temp;
        temp.next = n;
    }

    public boolean remove(String item) {
        if (item == null) return false;
        Node currentNode = header;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            if (item.equals(currentNode.value)) {
                Node previous = currentNode.previous;
                Node next = currentNode.next;
                previous.next = next;
                if (next != null) {
                    next.previous = previous;
                }
                currentNode = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
		list.remove("Harry");
        System.out.println(list);
    }
}
