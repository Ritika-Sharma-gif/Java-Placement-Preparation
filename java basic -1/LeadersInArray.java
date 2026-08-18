import java.util.Scanner;

public class LeadersInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxFromRight = arr[n - 1];

        System.out.println("Leaders in the array:");

        System.out.print(maxFromRight + " ");

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }

        sc.close();
    }
}