public class ReverseLinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void insert(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    void reverse() {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        head = previous;
    }

    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ReverseLinkedList list = new ReverseLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Before:");
        list.display();

        list.reverse();

        System.out.println("After:");
        list.display();
    }
}