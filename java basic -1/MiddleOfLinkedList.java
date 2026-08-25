 public class MiddleOfLinkedList {
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
    void findMiddle() {
        Node slow = head; 
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next;
        }
        System.out.println("Middle = " + slow.data);
    }
    public static void main(String[] args) {
        MiddleOfLinkedList list = new MiddleOfLinkedList();


        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.findMiddle();
    }
}