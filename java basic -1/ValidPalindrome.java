public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        str = str.toLowerCase();
        String clean = " ";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)) {
                clean = clean + ch;
            }
        }

        int left = 0;
        int right = clean.length() - 1;

        boolean palindrome = true;

        while (left < right) {
            if(clean.charAt(left) != clean.charAt(right)) {
                palindrome = false; 
                break;
            }

            left++;
            right--;

        System.out.println("Palindrome = " + palindrome);
        }
    }
}