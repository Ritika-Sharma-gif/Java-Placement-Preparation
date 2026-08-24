public class StackUsingLinkedList {

    Node top;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void push(int value) {

        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;
    }

    void pop() {

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Popped: " + top.data);

        top = top.next;
    }

    void peek() {

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top: " + top.data);
    }

    public static void main(String[] args) {

        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();

        stack.pop();
        stack.pop();

        stack.peek();
    }
}