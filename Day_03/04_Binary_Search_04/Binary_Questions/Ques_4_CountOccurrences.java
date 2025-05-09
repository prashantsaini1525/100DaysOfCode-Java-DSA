public class Ques_4_CountOccurrences {
    // Returns how many times 'target' appears in 'arr'
    public static int countOccurrences(int[] arr, int target) {
        int first = findFirst(arr, target);
        if (first == -1) {
            return 0; // target not found
        }
        int last = findLast(arr, target);
        return last - first + 1;
    }

    // Helper to find the first index of 'target', or -1 if missing
    private static int findFirst(int[] arr, int target) {
        int start = 0, end = arr.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // overflow-safe midpoint
            if (arr[mid] == target) {
                result = mid;
                end = mid - 1; // continue searching left
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    // Helper to find the last index of 'target', or -1 if missing
    private static int findLast(int[] arr, int target) {
        int start = 0, end = arr.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // overflow-safe midpoint
            if (arr[mid] == target) {
                result = mid;
                start = mid + 1; // continue searching right
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6};
        int target = 5;

        int count = countOccurrences(arr, target);
        System.out.println("Count of " + target + " = " + count);
    }
}
