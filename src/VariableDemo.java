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

