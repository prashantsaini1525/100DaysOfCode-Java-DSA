// Ques: Print out the sum of the numbers in the second row of the "nums" array. 

public class Sum {

    public static int sum(int nums[][]) {
        int sum = 0;
        for (int i = 0; i < nums[1].length; i++) {
            sum += nums[1][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[][] = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };
        System.out.println("Sum of 2nd row: " + sum(nums));
    }
}
