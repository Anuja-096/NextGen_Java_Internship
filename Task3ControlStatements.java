
public class Task3ControlStatements {

    public static void main(String[] args) {

        // 1. IF-ELSE STATEMENT
        System.out.println("===== IF-ELSE STATEMENT =====");

        int marks = 75;

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // 2. SWITCH STATEMENT
        System.out.println("\n===== SWITCH STATEMENT =====");

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 3. FOR LOOP
        System.out.println("\n===== FOR LOOP =====");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 4. WHILE LOOP
        System.out.println("\n===== WHILE LOOP =====");

        int count = 1;

        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        // 5. DO-WHILE LOOP
        System.out.println("\n===== DO-WHILE LOOP =====");

        int number = 1;

        do {
            System.out.println(number);
            number++;
        } while (number <= 5);
    }
}
