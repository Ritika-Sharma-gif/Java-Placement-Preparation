import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = scanner.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        
        for(int i = 0; i <= n; i++ ) {
            if(i % 2 == 0) {
                evenCount++;
            
            } else {
                oddCount++;
            }
        }
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
        scanner.close();
    }
}