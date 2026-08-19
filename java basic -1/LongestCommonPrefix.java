import java.util.Scanner;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        String prefix = words[0];

        for (int i = 1; i < n; i++) {

            int j = 0;

            while (j < prefix.length()
                    && j < words[i].length()
                    && prefix.charAt(j) == words[i].charAt(j)) {

                j++;
            }

            prefix = prefix.substring(0, j);

            if (prefix.isEmpty()) {
                break;
            }
        }

        if (prefix.isEmpty()) {
            System.out.println("No common prefix.");
        } else {
            System.out.println("Longest Common Prefix = " + prefix);
        }

        sc.close();
    }
}