import java.util.Scanner;

public class MaximumSubarraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int currentSum = numbers[0];
        int maximumSum = numbers[0];

        for (int i = 1; i < n; i++) {

            currentSum = Math.max(numbers[i], currentSum + numbers[i]);

            maximumSum = Math.max(maximumSum, currentSum);
        }

        System.out.println("Maximum Subarray Sum = " + maximumSum);

        sc.close();
    }
}