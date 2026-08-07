import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        int square = number * number;
        int temp = number;

        while (temp > 0) {

            if ((temp % 10) != (square % 10)) {
                System.out.println(number + " is Not an Automorphic Number.");
                sc.close();
                return;
            }

            temp = temp / 10;
            square = square / 10;
        }

        System.out.println(number + " is an Automorphic Number.");

        sc.close();
    }
}