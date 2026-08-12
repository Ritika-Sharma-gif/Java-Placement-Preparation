import java.util.Scanner;

public class TwoSumArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (numbers[i] + numbers[j] == target) {

                    System.out.println(
                        "Pair found: " + numbers[i] + " + "
                        + numbers[j] + " = " + target
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }

        sc.close();
    }
}