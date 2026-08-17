import java.util.Scanner;

public class MaxSumKConsecutive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        if (k <= 0 || k > n) {
            System.out.println("Invalid window size.");
            sc.close();
            return;
        }

        // Calculate sum of first window
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {

            windowSum = windowSum + arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum sum of " + k
                + " consecutive elements = " + maxSum);

        sc.close();
    }
}