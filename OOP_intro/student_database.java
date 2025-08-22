package OOP_intro;

public class student_database {
    // Define the Student class at the top level
    static class Student {
        String name;
        int age;
        String grade;

        // Constructor to initialize student object
        Student(String name, int age, String grade) { 
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        // Method to display student information
        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        // Create a student object and display info
        Student s1 = new Student("Alice", 20, "A");
        s1.displayInfo();
    }
}