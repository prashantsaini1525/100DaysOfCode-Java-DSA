public class ArraysArgument1 {
       // Callee method: receives a copy of the reference to 'marks' and a copy of 'nonChangable'
    public static void update(int marks[], int nonChangable) {
        nonChangable = 10; // (1) Reassigns only the local copy of the primitive variable 'nonChangable'
        // (2) The original array 'marks' is modified because the reference to the array is passed by value
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1; //marks[i] + 1
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};    // (3) Caller’s array
        int nonChangable = 5;       // (4) Caller’s primitive

        //print our marks in array
        System.out.print("Before update: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        //update our marks in array using function
        update(marks, nonChangable); // Invoke callee: copies of 'marks' reference and 'nonChangable' value
        System.out.println("Non-changable value: " + nonChangable);  // nonChangable remains unchanged in the caller

        //print our marks in array
        // marks array elements have all been incremented by 1
        System.out.print("After update: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
    
}
