// time complexity: O(n^2) for nested loops
// space complexity: O(1) for constant space usage
public class PairsArrays {

    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i]; //2, 4, 6, 8, 10
            for (int j = i + 1; j < numbers.length; j++) {
                // int next = numbers[j]; //4, 6, 8, 10, 12
                System.out.print("(" + curr + ", " + numbers[j] + ") "); //(2, 4), (2, 6), (2, 8), (2, 10), (4, 6), (4, 8), (4, 10), (6, 8), (6, 10), (8, 10)
                tp++; //total pairs printed
            }
            System.out.println(); //new line for next pair
        }
        System.out.println("Total pairs printed: " + tp); //total pairs printed
        // 10 pairs printed
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}
