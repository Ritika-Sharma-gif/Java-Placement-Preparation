import java.util.Scanner; 
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        String binary = " ";

        while(number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number /2;
        } 
        System.out.println("Binary = " + binary);
        sc.close(); 
    }
}