import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }

        int longest = 0;

        for (int num : set) {

            // Start only if num is the beginning
            // of a consecutive sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest Consecutive Sequence Length = " + longest);

        sc.close();
    }
}