import java.util.Scanner;

public class RangeSumPrefix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] prefix = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create prefix sum array
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.print("Enter left index: ");
        int left = sc.nextInt();

        System.out.print("Enter right index: ");
        int right = sc.nextInt();

        int rangeSum;

        if (left == 0) {
            rangeSum = prefix[right];
        } else {
            rangeSum = prefix[right] - prefix[left - 1];
        }

        System.out.println("Range Sum = " + rangeSum);

        sc.close();
    }
}