import java.util.Scanner;

public class ProductExceptSelf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] result = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store product of all elements to the left
        int prefixProduct = 1;

        for (int i = 0; i < n; i++) {

            result[i] = prefixProduct;

            prefixProduct *= arr[i];
        }

        // Multiply by product of all elements to the right
        int suffixProduct = 1;

        for (int i = n - 1; i >= 0; i--) {

            result[i] *= suffixProduct;

            suffixProduct *= arr[i];
        }

        System.out.println("Product of array except self:");

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}