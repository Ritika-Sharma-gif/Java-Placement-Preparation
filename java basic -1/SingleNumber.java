public class SingleNumber {

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int answer = 0;

        for(int i = 0; i < arr.length; i++) {
            answer = answer  ^  arr[i];
        }
    System.out.println("Single number = " + answer);
    }
}