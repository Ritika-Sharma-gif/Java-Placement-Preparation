import java.util.Scanner;
import java.util.Stack;

public class MinStack {

    static Stack<Integer> mainStack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    // Push
    static void push(int value) {

        mainStack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }

        System.out.println(value + " pushed");
    }

    // Pop
    static void pop() {

        if (mainStack.isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }

        int removed = mainStack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }

        System.out.println(removed + " popped");
    }

    // Peek
    static void peek() {

        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top = " + mainStack.peek());
    }

    // Get minimum
    static void getMin() {

        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Minimum = " + minStack.peek());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- MIN STACK ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Get Minimum");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    getMin();
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}