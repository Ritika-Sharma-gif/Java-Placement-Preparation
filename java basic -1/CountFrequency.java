import java.util.Scanner;

public class CountFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the element to count: ");
        int target = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (numbers[i] == target) {
                count++;
            }
        }

        System.out.println(target + " occurs " + count + " time(s).");

        sc.close();
    }
}