import java.util.Scanner; 
public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        if(str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.println("The second string is a roation of the first string: ");
        } else {
            System.out.println("The second string is not a rotation of the first string.");
        }
        sc.close();
    }
}