public class SumOfArray {
    public static int getsum(int numbers[]) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Sum of Array is : " + getsum(numbers));
    }
    
}
