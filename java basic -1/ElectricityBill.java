import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units Consumed:");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 2.0;
        }
        else if (units <= 200) {
              bill = (100 * 2.0) + ((units - 100) * 3.5);
        }    
        else if (units <= 300) {
            bill = (100 * 2.0) + (100 * 3.5) + ((units - 200) *5.0);
        } 
        else {
            bill = (100 * 2.0) + (100 * 3.5) + (100 * 5.0) + ((units - 300) * 7.0);
        }       
        System.out.println("Total Electricity Bill: " + bill);
        sc.close();
    }

}