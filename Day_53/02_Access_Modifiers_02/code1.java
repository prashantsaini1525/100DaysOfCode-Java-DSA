
public class code1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.setRoll(101); // Use setter to set roll
        s1.school = "ABC High School";
        s1.displayInfo();
    }
}

class Student {

    public String name;
    private int roll;
    public String school;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("School: " + school);
    }
}
