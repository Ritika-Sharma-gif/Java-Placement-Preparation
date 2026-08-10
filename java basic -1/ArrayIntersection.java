import java.util.Scanner;

public class ArrayIntersection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] array1 = new int[n1];

        System.out.println("Enter elements of first array:");

        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] array2 = new int[n2];

        System.out.println("Enter elements of second array:");

        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        System.out.println("Intersection:");

        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < n2; j++) {

                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}