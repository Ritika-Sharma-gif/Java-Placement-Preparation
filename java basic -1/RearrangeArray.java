import java.util.Scanner;

public class RearrangeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = 0;

        while (left <= right) {

            if (index < n) {
                result[index] = arr[right];
                index++;
                right--;
            }

            if (index < n) {
                result[index] = arr[left];
                index++;
                left++;
            }
        }

        System.out.println("Rearranged array:");

        for (int value : result) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}