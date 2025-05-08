public class MaxNumber {
    public static int findmax(int numbers[]) {
        int max = numbers[0];  // Assume first element is max
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10,12,14,16,18,};

        int result = findmax(numbers);
        System.out.println("Maximum number is: " + result);
    }
    
}
