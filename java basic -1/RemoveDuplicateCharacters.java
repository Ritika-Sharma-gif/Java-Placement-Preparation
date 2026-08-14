import java.util.Scanner;
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = ""; 
        for(int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if(result.indexOf(current)== -1) {
                result += current;
            }
        }
        System.out.println("Original string: " + str);
        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }
}