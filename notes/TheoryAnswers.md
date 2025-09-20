# Theory Answers – BIT2115

## 1. Difference between Local, Instance, and Static Variables
- **Local Variable:** Declared inside a method, exists only while the method runs.  
- **Instance Variable:** Belongs to an object, each object has its own copy.  
- **Static Variable:** Belongs to the class itself, shared by all objects.

---

## 2. Accessing Uninitialized Variables
- **Local variables:** Must be initialized before use, otherwise compile-time error.  
- **Instance/Static variables:** If uninitialized, Java assigns default values (0, null, false).

---

## 3. Scope and Lifetime
- **Local:** Exists only in the method. Disappears once the method finishes.  
- **Instance:** Exists as long as the object exists.  
- **Static:** Created once per class, lives until the program ends.

---

## 4. Why Local Variables Cannot Have Access Modifiers
They belong only to the block/method where declared, so access control (public/private) isn’t relevant.

---

## 5. Practical Scenario for Static Variables
Static variables are useful for shared data.  
**Example: Counting objects created**
```java
class Student {
    static int count = 0;
    Student() { count++; }
}
