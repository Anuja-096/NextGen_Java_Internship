
class Student {

    String name;
    int age;
    String course;

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Task5ClassesObjects {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Anuja";
        student1.age = 21;
        student1.course = "ENTC";

        System.out.println("===== STUDENT DETAILS =====");

        student1.displayDetails();
    }
}

