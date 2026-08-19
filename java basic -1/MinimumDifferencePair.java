import java.util.Arrays;
import java.util.Scanner;

public class MinimumDifferencePair {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("At least two elements are required.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int minDifference = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;

        for (int i = 1; i < n; i++) {

            int difference = arr[i] - arr[i - 1];

            if (difference < minDifference) {

                minDifference = difference;

                first = arr[i - 1];
                second = arr[i];
            }
        }

        System.out.println("Minimum Difference Pair: "
                + first + " and " + second);

        System.out.println("Minimum Difference = "
                + minDifference);

        sc.close();
    }
}