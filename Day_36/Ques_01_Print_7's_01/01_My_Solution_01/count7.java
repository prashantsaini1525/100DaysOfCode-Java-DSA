// Ques : Print the number of 7's that are in the 2D array

public class count7 {

    public static int count7(int arr[][]) {
        int count = 0;
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {4, 7, 8},
            {8, 8, 7}
        };
        System.out.println(count7(arr));
    }
}
