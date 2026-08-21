import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push every character
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();

        // Pop every character
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}