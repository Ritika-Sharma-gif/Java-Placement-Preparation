import java.util.Scanner;

public class FindDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean found = false;

        System.out.println("Duplicate elements:");

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}