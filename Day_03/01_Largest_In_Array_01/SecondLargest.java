public class SecondLargest {
    public static int getsecondlargest(int numbers[]) {
        int largest =Integer.MIN_VALUE; // - infinite
        int secondlargest = Integer.MIN_VALUE; // - infinite
        for (int i = 0; i <  numbers.length; i++) {
            if(largest < numbers [i]) {
                secondlargest = largest;
                largest = numbers[i];
            } else if (secondlargest < numbers[i] && numbers[i] != largest) {
                secondlargest = numbers[i];
            }
        }
        return secondlargest;
    }    
    public static void main (String[] args) {
        int numbers[] = {2,4,6,8,16,32,64};
        System.out.println("Second Largest Value is : " + getsecondlargest(numbers));
    }
}
