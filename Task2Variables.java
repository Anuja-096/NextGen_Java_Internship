public class Task2Variables {

    public static void main(String[] args) {

        // Variables and Data Types

        String name = "Anuja";
        byte age = 21;
        short year = 2026;
        int a = 20;
        int b = 10;
        long population = 100000L;
        float percentage = 85.5f;
        double marks = 90.75;
        char grade = 'A';
        boolean passed = true;

        System.out.println("===== VARIABLES AND DATA TYPES =====");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Long Value: " + population);
        System.out.println("Percentage: " + percentage);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);

        // Arithmetic Operators

        System.out.println("\n===== ARITHMETIC OPERATORS =====");

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators

        System.out.println("\n===== RELATIONAL OPERATORS =====");

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        // Logical Operators

        System.out.println("\n===== LOGICAL OPERATORS =====");

        System.out.println("AND: " + (a > b && b > 5));
        System.out.println("OR: " + (a < b || b == 10));
        System.out.println("NOT: " + !(a > b));

        // Assignment Operator

        System.out.println("\n===== ASSIGNMENT OPERATOR =====");

        int score = 10;
        score += 5;
        System.out.println("Updated Score: " + score);

        // Unary Operators

        System.out.println("\n===== UNARY OPERATORS =====");

        int count = 5;
        count++;
        System.out.println("After Increment: " + count);

        count--;
        System.out.println("After Decrement: " + count);
    }
}