class Student {
    static int count = 0; // shared across all objects

    Student() {
        count++;
    }
}

public class StaticExample {
    public static void main(String[] args) {
        new Student();
        new Student();
        new Student();
        System.out.println("Number of students: " + Student.count);
    }
}
