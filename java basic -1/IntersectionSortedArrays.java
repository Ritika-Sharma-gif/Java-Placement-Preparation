import java.util.Scanner;

public class IntersectionSortedArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter first sorted array:");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Enter second sorted array:");

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;

        System.out.println("Intersection:");

        while (i < n && j < m) {

            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        sc.close();
    }
}