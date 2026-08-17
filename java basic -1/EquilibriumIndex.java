import java.util.Scanner;
public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        int totalSum = 0; 
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];

        }
        int leftSum = 0;
        boolean found = false; 
        for(int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum) {
                System.out.println("Equilibrium Index = " + i);
                found = true;
                break;
            }
            leftSum += arr[i];

        }
        if(!found) {
            System.out.println("No equilibrium index found.");
        }
        sc.close();

    }
}