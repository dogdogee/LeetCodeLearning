public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
    public void add(int value) {
        Node current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }
}
