
import java.util.Scanner;

public class Task8BankingSystem {

    static class BankAccount {

        private String accountHolder;
        private double balance;

        BankAccount(String name, double initialBalance) {
            accountHolder = name;
            balance = initialBalance;
        }

        void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Amount deposited successfully!");
            } else {
                System.out.println("Enter a valid amount.");
            }
        }

        void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Enter a valid amount.");
            } else if (amount <= balance) {
                balance -= amount;
                System.out.println("Amount withdrawn successfully!");
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        void displayBalance() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Available Balance: Rs. " + balance);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount("Anuja", 1000);

        int choice;

        System.out.println("===== BANKING MANAGEMENT SYSTEM =====");

        do {
            System.out.println("\n1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using our banking system!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
