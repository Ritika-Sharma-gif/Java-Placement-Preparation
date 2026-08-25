public class SearchLinkedList {
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

        if(head == null) {
            head = newNode;
            return;
        }
        Node current = head; 
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    void search(int value) {
        Node current = head; 
        int position = 0;

        while (current != null) {
            if (current.data == value) {
                System.out.println(
                    value + "found at position" + position
                );
                return;
            }
            current = current.next;
            position++;
        }
        System.out.println(value + "not found");

    }
    public static void main(String[] args) {
        SearchLinkedList list = new SearchLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.search(30);
        list.search(50);
    }
}