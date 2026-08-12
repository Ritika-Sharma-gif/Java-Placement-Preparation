import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int candidate = numbers[0];
        int count = 1;

        for (int i = 1; i < n; i++) {

            if (numbers[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = numbers[i];
                count = 1;
            }
        }

        count = 0;

        for (int i = 0; i < n; i++) {

            if (numbers[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("Majority Element = " + candidate);
        } else {
            System.out.println("No Majority Element.");
        }

        sc.close();
    }
}