public class Even {

    public static void even_numbers(int number[]) {
        boolean found = false;
        for(int i = 0; i < number.length; i++) {
            if(number[i] % 2 == 0) {
                found = true;
                System.out.print(number[i] + " ");
            }
        }
        if(!found) {
            System.out.println("No even numbers found in the array.");
        }
    }
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 , 12, 13, 14, 15};
        System.out.print("Even numbers in the array: ");
        even_numbers(number);
    }
}
