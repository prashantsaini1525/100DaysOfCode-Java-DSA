# Classes & Objects (Apna College Alpha Batch 3.0)

> Compact, beginner-friendly, notebook-style explanation with simple Java examples.

---

## 1. Short definition

* **Class** = a blueprint or template. It defines variables (fields) and methods (actions).
* **Object** = an instance of a class. Real-world entity created from the class.
* Analogy: Class = recipe, Object = cake.

---

## 2. Why we need Classes & Objects

* To model **real-world things** in code (e.g., Pen, Student, BankAccount).
* To organize data + behavior together.
* To make code **reusable** (one class → many objects).
* Foundation of **OOP concepts** (encapsulation, inheritance, polymorphism, abstraction).

> Notebook tip: *Class = what it looks like, Object = actual thing you use.*

---
## 3. Structure of a Class (Java)

A class usually contains:

* **Fields/Variables** → data (e.g., color, age, rollNo)
* **Methods** → actions (e.g., setColor, calcPercentage)

Example:

```java
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
```

---

## 4. Creating and using Objects

Objects are created using `new` keyword:

```java
public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();   // create object of Pen class
        p1.setColor("Blue"); // call method
        p1.setTip(5);

        Pen p2 = new Pen();   // another object
        p2.setColor("Black");
        p2.setTip(7);

        System.out.println(p1.color); // Blue
        System.out.println(p2.color); // Black
    }
}
```

Key points:

1. `new Pen()` allocates memory and returns a reference.
2. Each object has its **own copy** of fields.
3. Methods operate on that object’s fields.

---

## 5. Another Example — Student Class

```java
class Student {
    String name;
    int age;
    int rollNo;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
```

Usage:

```java
Student s1 = new Student();
s1.name = "John";
s1.age = 20;
s1.rollNo = 101;
s1.calcPercentage(85, 90, 80);

Student s2 = new Student();
s2.name = "Alice";
s2.age = 19;
s2.rollNo = 102;
s2.calcPercentage(75, 80, 70);

System.out.println(s1.name + " - " + s1.percentage);
System.out.println(s2.name + " - " + s2.percentage);
```

---

## 6. Class vs Object — Quick Table

| Feature    | Class                            | Object                        |
| ---------- | -------------------------------- | ----------------------------- |
| Definition | Blueprint, template              | Instance of the class         |
| Created    | Defined once in code             | Created using `new`           |
| Memory     | Doesn’t occupy memory for fields | Allocated in heap             |
| Example    | `class Student {}`               | `Student s1 = new Student();` |

---

## 7. Memory Model (Beginner level)

When we write:

```java
Student s1 = new Student();
```

* `s1` → reference variable (stored in stack)
* `new Student()` → object created in heap

If `s1 = null;` → reference is empty, object becomes unreachable.

---

## 8. Key Vocabulary

* **Instance** → An object created from a class.
* **Fields/Properties** → Variables inside a class.
* **Methods** → Functions inside a class.
* **Constructor** → Special method to initialize objects (next topic).

---

## 9. Real-life Examples

* `class Car { String color; int speed; void drive(); }`
* `class BankAccount { double balance; void deposit(); }`
* `class Student { String name; int rollNo; void enroll(); }`

---

## 10. Practice Checklist

* [ ] Create a `Book` class with fields: `title`, `author`, `price`.
* [ ] Add a method `applyDiscount(int percent)`.
* [ ] In `main`, create two `Book` objects with different details and apply discounts.

---

## 11. One-line Summary

> **Class = Concept/Blueprint, Object = Actual Instance with data & behavior.**

---

## 12. Common Pitfalls

* Forgetting to use `new` → no object created.
* Accessing a field before initializing → default values (`0`, `null`, `false`).
* Mixing up **class vs object**: Class defines, Object uses.

---

## Conclusion

Classes and Objects are the **building blocks of OOP**. A class defines the structure, and objects bring it to life in memory. Mastering this step is crucial before moving to **constructors, encapsulation, inheritance, and polymorphism**.
