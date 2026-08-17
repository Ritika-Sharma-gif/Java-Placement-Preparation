import java.util.Scanner;
public class MoveNegatives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter every elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int left = 0;
        int right = n-1;
        while(left <= right) {
            if(arr[left] < 0) {
                left++;

            }
            else if (arr[right] >= 0) {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        System.out.println("Array after moving negative elements: ");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}