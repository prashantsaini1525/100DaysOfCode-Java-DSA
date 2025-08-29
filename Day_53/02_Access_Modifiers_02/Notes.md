# Access Modifiers (Apna College Alpha Batch 3.0)

> Compact, beginner-friendly, notebook-style explanation with simple Java examples.

---

## 1. Short definition

* **Access modifiers** = keywords that control **visibility (scope)** of classes, variables, methods, and constructors.
* They decide **“who can access what”** in a program.

---

## 2. Why we need Access Modifiers

* To enforce **encapsulation** (hiding internal details).
* To protect data from **unauthorized access**.
* To control **code reusability** and **API design**.

> Notebook tip: *Think of access modifiers as the "locks" on doors in your program.*

---

## 3. Types of Access Modifiers in Java

| Modifier                 | Scope (Where it can be accessed)                                |
| ------------------------ | --------------------------------------------------------------- |
| **public**               | Accessible from **anywhere** in the program.                    |
| **protected**            | Accessible in the **same package** and by **child (subclass)**. |
| **default** (no keyword) | Accessible **only within the same package**.                    |
| **private**              | Accessible **only within the same class**.                      |

---

## 4. Small Examples

### Public

```java
public class Student {
    public String name;
}
```

*Can be accessed from any class.*

### Private

```java
class Student {
    private int age;
}
```

*Only methods inside `Student` can use `age`.*

### Protected

```java
class Person {
    protected String nationality;
}
```

*Accessible in same package + subclasses.*

### Default (no modifier)

```java
class Student {
    String college;
}
```

*Accessible only inside the same package.*

---

## 5. Quick Analogy

* **public** = Open gate → anyone can enter.
* **protected** = Friends & family only → package + children.
* **default** = Neighborhood only → same package.
* **private** = Locked room → only you.

---

## 6. Access Modifiers in Classes vs Members

* **Classes**: Can only be `public` or `default`.
* **Members** (fields, methods, constructors): Can use all four (`public`, `protected`, `default`, `private`).

---

## 7. Real-life Examples

* **private** → Bank account PIN.
* **public** → Customer care phone number.
* **protected** → Family recipe (shared with children only).
* **default** → Local shop (only people in the same neighborhood).

---

## 8. Key Vocabulary

* **Visibility/Scope** → Where code can be accessed from.
* **Encapsulation** → Hiding internal details and controlling access.

---

## 9. Practice Checklist

* [ ] Create a `BankAccount` class with `private balance` and methods `deposit` and `withdraw`.
* [ ] Try creating a `Student` class with `protected rollNo` and extend it in another class.
* [ ] Experiment with a `default` field inside a class and try accessing it from another package.

---

## 10. One-line Summary

> **Access Modifiers = Control doors of your class. Decide who can enter and who cannot.**

---

## 11. Common Pitfalls

* Trying to access `private` data directly from another class.
* Forgetting that **default** only works in the same package.
* Assuming `protected` means “same package only” (it also includes subclasses in other packages).

---

## Conclusion

Access modifiers give **control and security** in OOP. They help achieve **encapsulation** and maintain clean, safe code. Before moving to advanced topics like **inheritance** and **polymorphism**, mastering access modifiers ensures you know how to guard your class members properly.
