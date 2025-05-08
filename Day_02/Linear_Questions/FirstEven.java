public class FirstEven {

    public static int even_number(int number[]){
        for(int i = 0; i < number.length; i++) {
            if(number[i] % 2 == 0) {
                return number[i];
            }
        }
        return -1; // If no even number is found, return -1
    }
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 , 12, 13, 14, 15};

        int result = even_number(number);
        if(result != -1) {
            System.out.println("The first even number in the array is: " + result);
        } else {
            System.out.println("No even number found in the array.");
        }
    }
    
}
