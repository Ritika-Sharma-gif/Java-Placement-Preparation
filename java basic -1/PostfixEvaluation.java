import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter postfix expression: ");
        String expression = sc.nextLine();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            // Ignore spaces
            if (ch == ' ') {
                continue;
            }

            // If character is a number
            if (Character.isDigit(ch)) {

                stack.push(ch - '0');

            } else {

                int second = stack.pop();
                int first = stack.pop();

                int result = 0;

                switch (ch) {

                    case '+':
                        result = first + second;
                        break;

                    case '-':
                        result = first - second;
                        break;

                    case '*':
                        result = first * second;
                        break;

                    case '/':
                        result = first / second;
                        break;

                    default:
                        System.out.println("Invalid operator.");
                        sc.close();
                        return;
                }

                stack.push(result);
            }
        }

        System.out.println("Result = " + stack.pop());

        sc.close();
    }
}