# 📘 Day 53: Object-Oriented Programming (OOPs) Basics in Java

## 1. Short definition

OOP (Object-Oriented Programming) is a paradigm where we design programs using **classes** and **objects**. A **class** is the blueprint, while an **object** is the real-world instance of that blueprint.

---

## 2. What I Did Today

* Learned how to create **classes** and **objects** in Java.
* Practiced **encapsulation** using getters & setters.
* Worked with examples like `Pen`, `Student`, and `BankAccount`.
* Implemented **data hiding** by using `private` fields and providing controlled access methods.

---

## 3. Idea

* **Class** → Blueprint (defines properties and behaviors).
* **Object** → Instance of a class (actual entity in memory).
* **Encapsulation** → Wrapping data (variables) and code (methods) together in a single unit.
* **Access Modifiers** → Control visibility (`public`, `private`).

---

## 4. Pseudocode (Class & Object basics)

```java
class ClassName {
    // properties
    // methods
}

// create object
ClassName obj = new ClassName();
```

---

## 5. Examples

### Example 1: Pen Class

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

Usage:

```java
Pen p1 = new Pen();
p1.setColor("Blue");
p1.setTip(5);
```

### Example 2: Student Class

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

### Example 3: Encapsulation with BankAccount

```java
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
```

Usage:

```java
BankAccount myAcc = new BankAccount();
myAcc.username = "prashant1525";
myAcc.setPassword("mypassword");
```

### Example 4: Private Fields with Getters/Setters

```java
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

---

## 6. Common Pitfalls

* Forgetting to use **`this`** when assigning values inside setters.
* Accessing `private` variables directly (should use getters & setters).
* Creating multiple objects but expecting them to share the same data (each object has its own copy).

---

## 7. Key Takeaways

* **Class = Blueprint, Object = Instance.**
* Use **`private`** fields + getters/setters to implement **encapsulation**.
* OOP helps structure programs in a modular and reusable way.
* Practiced examples: `Pen`, `Student`, `BankAccount`.

---

*Prepared as part of Day 53 of #100DaysOfCode*
