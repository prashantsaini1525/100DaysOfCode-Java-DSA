public class Count {

    public static int countnumber(int number[], int target){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int number[] = {5,2,6,5,4,5,8,11,10,5,5,10};
        int target = 5;

        int result = countnumber(number, target);
        System.out.println("Number of occurrences of " + target + " in the array: " + result);
    }
    
}
