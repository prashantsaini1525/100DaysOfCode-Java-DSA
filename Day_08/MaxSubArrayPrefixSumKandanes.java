//time Complexity for this code is O(n)
//space Complexity for this code is O(1)

public class MaxSubArrayPrefixSumKandanes {

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE; //max sum
        int cs = 0; //current sum

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i]; //add the current element to the current sum
            if (cs < 0) { //if current sum is negative, reset it to 0
                cs = 0;
            }
            ms = Math.max(ms, cs); //update max sum if current sum is greater
        }
        System.out.println("Max Subarray Sum is : " + ms); //print the max sum
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}
