
public class Task6OOPConcepts {

    static class PersonData {
        private String name;
        private int age;

        void setDetails(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }

        void displayRole() {
            System.out.println("Person");
        }
    }

    static class StudentData extends PersonData {
        @Override
        void displayRole() {
            System.out.println("Role: Student");
        }
    }

    static class TeacherData extends PersonData {
        @Override
        void displayRole() {
            System.out.println("Role: Teacher");
        }
    }

    public static void main(String[] args) {

        StudentData student = new StudentData();
        student.setDetails("Anuja", 21);

        TeacherData teacher = new TeacherData();
        teacher.setDetails("Rahul", 35);

        System.out.println("===== INHERITANCE =====");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        System.out.println("\n===== POLYMORPHISM =====");

        PersonData p1 = student;
        PersonData p2 = teacher;

        p1.displayRole();
        p2.displayRole();

        System.out.println("\n===== ENCAPSULATION =====");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
