public class LengthOfLastWord {

    public static void main(String[] args) {

        String str = "Hello World";

        int i = str.length() - 1;

        // Skip spaces at the end
        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }

        int count = 0;

        // Count the last word
        while (i >= 0 && str.charAt(i) != ' ') {
            count++;
            i--;
        }

        System.out.println("Length of last word = " + count);
    }
}