import java.util.Scanner;

public class MoveZeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int position = 0;

        for (int i = 0; i < n; i++) {

            if (numbers[i] != 0) {

                int temp = numbers[position];
                numbers[position] = numbers[i];
                numbers[i] = temp;

                position++;
            }
        }

        System.out.println("Array after moving zeros to the end:");

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}