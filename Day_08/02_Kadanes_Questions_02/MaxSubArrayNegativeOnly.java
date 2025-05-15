//time Complexity for this code is O(n)
//space Complexity for this code is O(1)
public class MaxSubArrayNegativeOnly{
    public static void kadanes(int[] numbers) {
        int cs = numbers[0]; // current sum
        int ms = numbers[0]; // max sum

        for (int i = 1; i < numbers.length; i++) {
            cs = Math.max(numbers[i], cs + numbers[i]);
            ms = Math.max(ms, cs);
        }

        System.out.println("Max Subarray Sum is: " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = {-8, -3, -6, -2, -5, -4};
        kadanes(numbers);
    }
}