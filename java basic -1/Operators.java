public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        // Logical Operators
        System.out.println("(a > b && b > 0): " + (a > b && b > 0));
        System.out.println("(a < b || b > 0): " + (a < b || b > 0));

        // Assignment Operator
        int c = a;
        System.out.println("Value of c: " + c);

        // Unary Operators
        a++;
        b--;
        System.out.println("After increment, a = " + a);
        System.out.println("After decrement, b = " + b);
    }
}