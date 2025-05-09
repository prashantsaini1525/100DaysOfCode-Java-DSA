package Input_Output_Questions;

import java.util.*;

public class ArrayInputOutputupdate2 {

    public static void main(String[] args) {

        int marks[] = new int[100];
        int totalmarks = 400;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Physics Marks: ");
        marks[0] = sc.nextInt();

        System.out.print("Enter Your Chemistry Marks: ");
        marks[1] = sc.nextInt();

        System.out.print("Enter Your Math Marks: ");
        marks[2] = sc.nextInt();

        System.out.print("Enter Your English Marks: ");
        marks[3] = sc.nextInt();

        // Output Section
        System.out.println("\n--- Marks Summary ---");
        System.out.println("Physics Marks: " + marks[0]);
        System.out.println("Chemistry Marks: " + marks[1]);
        System.out.println("Math Marks: " + marks[2]);
        System.out.println("English Marks: " + marks[3]);

        // Calculate Total Marks
        int totalMarks = marks[0] + marks[1] + marks[2] + marks[3];
        System.out.println("Total Marks: " + totalMarks + "/400");

        // Calculate Percentage
        double percentage = (totalMarks / 400.0) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }
}
