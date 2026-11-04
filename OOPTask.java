
public class OOPTask {

    // Parent class
    static class Person {
        private String name;
        private int age;

        // Encapsulation
        public void setDetails(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        void displayRole() {
            System.out.println("Person");
        }
    }

    // Inheritance
    static class Student extends Person {
        @Override
        void displayRole() {
            System.out.println("Role: Student");
        }
    }

    static class Teacher extends Person {
        @Override
        void displayRole() {
            System.out.println("Role: Teacher");
        }
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.setDetails("Anuja", 21);

        Teacher teacher = new Teacher();
        teacher.setDetails("Rahul", 35);

        System.out.println("===== INHERITANCE =====");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        System.out.println("\n===== POLYMORPHISM =====");

        Person p1 = student;
        Person p2 = teacher;

        p1.displayRole();
        p2.displayRole();

        System.out.println("\n===== ENCAPSULATION =====");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
