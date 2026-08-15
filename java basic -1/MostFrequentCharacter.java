import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                frequency[ch]++;
            }
        }

        char mostFrequent = '\0';
        int maxFrequency = 0;

        // Find character with maximum frequency
        for (int i = 0; i < 256; i++) {

            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequent = (char) i;
            }
        }

        if (maxFrequency > 0) {
            System.out.println("Most Frequent Character = " + mostFrequent);
            System.out.println("Frequency = " + maxFrequency);
        } else {
            System.out.println("No character found.");
        }

        sc.close();
    }
}