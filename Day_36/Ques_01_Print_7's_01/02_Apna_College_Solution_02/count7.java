// Ques : Print the number of 7's that are in the 2D array

public class count7 {

    public static void main(String[] args) {
        int arr[][] = {
            {4, 7, 8},
            {8, 8, 7}
        };

        int countOf7 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        System.out.println("Count of 7 is: " + countOf7);
    }
}
