# Applied Object-Oriented Programming – Assignment (BIT2115)

**Faculty of Science and Technology**  
**Programme:** BIT  
**Year/Semester:** Year 2, Semester 1  
**Problem Name:** Converting Data & Variable Types  

---

## 📌 Contents
- `src/VariableDemo.java` → Demonstrates local, instance, and static variables.
- `src/DataConversionDemo.java` → Demonstrates data type conversions (explicit & implicit).
- `src/StaticExample.java` → Practical use of static variables.
- `notes/TheoryAnswers.md` → Written answers for theory questions.

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone <your-repo-url>
   cd BIT2115-Converting-Data-and-Variables/src


---

### 2. `src/VariableDemo.java`
```java
public class VariableDemo {

    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    // Method to show variables
    void showVariables() {
        // Local variable
        int localVar = 30;

        System.out.println("Value from Local Variable is: " + localVar);
        System.out.println("Value from Instance Variable is: " + instanceVar);
        System.out.println("Value from Static Variable is: " + staticVar);
    }

    public static void main(String[] args) {
        // Create an object
        VariableDemo demo = new VariableDemo();

        // Call the method
        demo.showVariables();
    }
}

