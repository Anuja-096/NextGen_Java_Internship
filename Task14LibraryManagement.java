
import java.util.ArrayList;
import java.util.Scanner;

public class Task14LibraryManagement {

    static class Book {
        int id;
        String title;
        String author;
        boolean issued;

        Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.issued = false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, title, author));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : books) {
                            System.out.println("ID: " + b.id
                                    + " | Title: " + b.title
                                    + " | Author: " + b.author
                                    + " | Status: "
                                    + (b.issued ? "Issued" : "Available"));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Book b : books) {
                        if (b.id == searchId) {
                            System.out.println("Book Found: " + b.title
                                    + " by " + b.author);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    found = false;

                    for (Book b : books) {
                        if (b.id == issueId) {
                            found = true;
                            if (!b.issued) {
                                b.issued = true;
                                System.out.println("Book issued successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    found = false;

                    for (Book b : books) {
                        if (b.id == returnId) {
                            found = true;
                            if (b.issued) {
                                b.issued = false;
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
