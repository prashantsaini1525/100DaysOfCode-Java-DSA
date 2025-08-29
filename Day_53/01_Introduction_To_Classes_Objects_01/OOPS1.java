
public class OOPS1 {

    public static void main(String[] args) {
        // Object is an instance of a class
        // Class is a blueprint of an object
        // Class is a user-defined data type
        // Class is a collection of objects
        // Class is a collection of variables and methods

        // Creating an object of the class
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 20;
        student1.rollNo = 101;

        Student student2 = new Student();
        student2.name = "Alice";
        student2.age = 19;
        student2.rollNo = 102;

        // Accessing the object's properties
        System.out.println("Student 1 Name: " + student1.name);
        System.out.println("Student 1 Age: " + student1.age);
        System.out.println("Student 1 Roll No: " + student1.rollNo);

        System.out.println("Student 2 Name: " + student2.name);
        System.out.println("Student 2 Age: " + student2.age);
        System.out.println("Student 2 Roll No: " + student2.rollNo);
    }
}

class Student {

    String name;
    int age;
    int rollNo;
}
