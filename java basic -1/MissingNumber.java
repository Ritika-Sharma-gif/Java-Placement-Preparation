import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers from 0 to " + n + ":");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum = actualSum + numbers[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Number = " + missing);

        sc.close();
    }
}