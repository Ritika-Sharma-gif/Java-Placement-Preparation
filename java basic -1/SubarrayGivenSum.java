import java.util.Scanner;

public class SubarrayGivenSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter positive array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int left = 0;
        int sum = 0;
        boolean found = false;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {

                System.out.println("Subarray found:");

                for (int i = left; i <= right; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No subarray found.");
        }

        sc.close();
    }
}