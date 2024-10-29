class Node {
    int data;
    Node next;

    Node(int data) {
        this(data, null); // Call the other constructor with next as null
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node y = new Node(2); // Directly initialize with array value
        System.out.println(y.data);
    }
}
