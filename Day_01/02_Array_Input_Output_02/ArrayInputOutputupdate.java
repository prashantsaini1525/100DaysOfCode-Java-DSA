import java.util.*;

public class ArrayInputOutputupdate {
    public static void main(String[] args) {
        int marks[] = new int[100];
        
        Scanner sc = new Scanner(System.in);
        //int phy;
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

        //update the marks of the Maths subject
        marks[2] = 100;
        System.out.println("Math: " + marks[2]);

        //add +1 to the marks of the Maths subject
        marks[2] = marks[2] + 1;
        System.out.println("Math: " + marks[2]);

        // subtract 1 from the marks of the Maths subject
        marks[2] = marks[2] - 1;
        System.out.println("Math: " + marks[2]);

        // multiply the marks of the Maths subject by 2
        marks[2] = marks[2] * 2;
        System.out.println("Math: " + marks[2]);

        // divide the marks of the Maths subject by 2
        marks[2] = marks[2] / 2;
        System.out.println("Math: " + marks[2]);

        // modulus the marks of the Maths subject by 2
        marks[2] = marks[2] % 2;
        System.out.println("Math: " + marks[2]);
    }
}
