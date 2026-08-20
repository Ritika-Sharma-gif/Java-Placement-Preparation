import java.util.Scanner;
public class StackUsingArray {
    static int[] stack;
    static int top = -1;


    static void push(int value) {
        if(top == stack.length -1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = value; 

        System.out.println(value+ "pushed into stack");

    }
    static void pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return; 
        }
        System.out.println(stack[top] + "popped from stack");
        top--;

    }
    static void peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element = " +stack[top]);
    }
    static void isEmpty() {
        if(top == -1) {
            System.out.println("Stack is empty");

        } else {
            System.out.println("Stack is not empty");
        }
    }

    static void display() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return; 
        } 
        System.out.println("Stack elements: ");

        for(int i = top;  i >= 0; i--) {
            System.out.println(stack[i]);
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        stack = new int[size];

        while (true) { 
            System.out.println("\n---STACK Menu---");
            System.out.println("1. Push ");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 : 
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    push(value);
                    break;
                case 2 : 
                    pop();
                    break;
                case 3 :
                    peek();
                    break;
                case 4:
                    isEmpty();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    System.out.println("Program ended. ");
                    sc.close();
                    return; 
                default:
                    System.out.println("Invalid choice.");

            }
            
        }
     } 
}

