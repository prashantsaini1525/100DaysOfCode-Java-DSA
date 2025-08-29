
public class OOPS {

    public static void main(String[] args) {
        Pen p1 = new Pen(); // Object creation statement for Pen class
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Red"; // Direct access to the property
        System.out.println(p1.color);

        Pen p2 = new Pen(); // Object creation statement for Pen class or we can say 2nd object of Pen class
        p2.setColor("Black");
        System.out.println(p2.color);
        p2.setTip(7);
        System.out.println(p2.tip);

        Student s1 = new Student(); // Object creation statement for Student class 
        s1.name = "John";
        s1.age = 20;
        s1.rollNo = 101;
        s1.calcPercentage(85, 90, 80);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.percentage);

        Student s2 = new Student(); // Object creation statement for Student class or we can say 2nd object of Student class
        s2.name = "Alice";
        s2.age = 19;
        s2.rollNo = 102;
        s2.calcPercentage(75, 80, 70);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNo);
        System.out.println(s2.percentage);
    }
}

class Pen {

    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {

    String name;
    int age;
    int rollNo;
    float percentage; //cgpa 

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
