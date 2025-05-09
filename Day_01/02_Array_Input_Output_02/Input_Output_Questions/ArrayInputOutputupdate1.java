package Input_Output_Questions;
import java.util.*;

public class ArrayInputOutputupdate1 {
    public static void main(String[] args) {
        int marks[] = new int[100];
        int totalmarks = 400;
        
        Scanner sc = new Scanner(System.in);
        //int phy
        //phy = sc.nextInt();
        //int chem = sc.nextInt();
        //int math = sc.nextInt();

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Math: " + marks[2]);
        System.out.println("English: " + marks[3]);

        int percentage = (marks[0] + marks[1] + marks[2] + marks[3]) * 100 / totalmarks;
        System.out.println("Percentage: " + percentage + "%");

        //length of the array
        System.out.println("Length of the array: " + marks.length);
    }
}
