
import java.sql.*;
import java.util.Scanner;

public class Task16EmployeeManagement {

    static final String URL = "jdbc:mysql://localhost:3306/LibraryDB";
    static final String USER = "root";
    static final String PASSWORD = "@Anujanaik09";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.println("Database connected successfully!");

            while (true) {
                System.out.println("\n--- Employee Management System ---");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Search Employee");
                System.out.println("4. Update Employee");
                System.out.println("5. Delete Employee");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String department = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        String insert = "INSERT INTO Employees VALUES (?, ?, ?, ?)";
                        try (PreparedStatement ps = con.prepareStatement(insert)) {
                            ps.setInt(1, id);
                            ps.setString(2, name);
                            ps.setString(3, department);
                            ps.setDouble(4, salary);
                            ps.executeUpdate();
                            System.out.println("Employee added successfully!");
                        }
                        break;

                    case 2:
                        String select = "SELECT * FROM Employees";
                        try (Statement st = con.createStatement();
                             ResultSet rs = st.executeQuery(select)) {

                            System.out.println("\nID | Name | Department | Salary");
                            while (rs.next()) {
                                System.out.println(
                                        rs.getInt("emp_id") + " | " +
                                                rs.getString("name") + " | " +
                                                rs.getString("department") + " | " +
                                                rs.getDouble("salary")
                                );
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to search: ");
                        int searchId = sc.nextInt();

                        String search = "SELECT * FROM Employees WHERE emp_id = ?";
                        try (PreparedStatement ps = con.prepareStatement(search)) {
                            ps.setInt(1, searchId);
                            try (ResultSet rs = ps.executeQuery()) {
                                if (rs.next()) {
                                    System.out.println("Employee Found:");
                                    System.out.println("Name: " + rs.getString("name"));
                                    System.out.println("Department: " + rs.getString("department"));
                                    System.out.println("Salary: " + rs.getDouble("salary"));
                                } else {
                                    System.out.println("Employee not found.");
                                }
                            }
                        }
                        break;

                    case 4:
                        System.out.print("Enter Employee ID to update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter New Department: ");
                        String newDepartment = sc.nextLine();

                        System.out.print("Enter New Salary: ");
                        double newSalary = sc.nextDouble();

                        String update = "UPDATE Employees SET name=?, department=?, salary=? WHERE emp_id=?";
                        try (PreparedStatement ps = con.prepareStatement(update)) {
                            ps.setString(1, newName);
                            ps.setString(2, newDepartment);
                            ps.setDouble(3, newSalary);
                            ps.setInt(4, updateId);

                            int rows = ps.executeUpdate();
                            System.out.println(rows > 0 ?
                                    "Employee updated successfully!" :
                                    "Employee not found.");
                        }
                        break;

                    case 5:
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = sc.nextInt();

                        String delete = "DELETE FROM Employees WHERE emp_id=?";
                        try (PreparedStatement ps = con.prepareStatement(delete)) {
                            ps.setInt(1, deleteId);
                            int rows = ps.executeUpdate();
                            System.out.println(rows > 0 ?
                                    "Employee deleted successfully!" :
                                    "Employee not found.");
                        }
                        break;

                    case 6:
                        System.out.println("Exiting Employee Management System.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
