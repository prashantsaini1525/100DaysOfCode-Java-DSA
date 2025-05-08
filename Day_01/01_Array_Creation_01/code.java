public class code{
    public static void main(String[] args) {
        int marks[] = new int [50];
        marks[0] = 85;
        marks[49] = 95;

        // We can also initialize the array in one line using curly braces
        int numbers[] = {0, 1, 2, 3, 4, 5, 6, 7};
        int moreNumbers[] = {8, 9, 10, 11, 12, 13, 14,};
        
        // An array of doubles
        double grades[] = {85.5, 90.0, 92.5, 88.0, 95.0};
        
        // An array of booleans
        boolean isStudent[] = {true, false, true, false, true};
        
        // An array of custom objects
        // Student students[] = {new Student("John", 20), new Student("Alice", 22), new Student("Bob", 19)};
        
        // An array of custom objects with multiple fields
        // Employee employees[] = {new Employee("Alice", 25, "Software Engineer"), new Employee("Bob", 30, "Data Scientist")};
        
        // An array of custom objects with constructors
        // Car cars[] = {new Car("Toyota", 2010, "Red"), new Car("Honda", 2020, "Blue")};

        
        // An array of Strings
        String fruits[] = {"Mango", "Apple", "Orange", "Banana"};
        
        // Printing the elements of the array
        System.out.println("Array of size 50: " + marks.length);
        System.out.println("First element: " + marks[0]);
        System.out.println("49th element: " + marks[49]);
    }
}