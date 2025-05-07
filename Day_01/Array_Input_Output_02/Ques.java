import java.util.Scanner;

public class Ques {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[4]; // Only 4 subjects, so size 4
        String[] subjects = {"Physics", "Chemistry", "Math", "English"};

        int totalMarks = 0;
        int fullMarks = 400; // Assuming each subject is out of 100

        // Input Loop
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter your " + subjects[i] + " marks: ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        // Output Section
        System.out.println("\n--- Marks Summary ---");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        double percentage = (totalMarks / (double)fullMarks) * 100;
        System.out.println("Total Marks: " + totalMarks + "/" + fullMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        sc.close();
    }
}
