// in this code marks are update because help of call by reference
public class ArraysArgument {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1; //marks[i] + 1
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        update(marks);

        //print our marks in array
        System.out.print("Updated Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
    
}
