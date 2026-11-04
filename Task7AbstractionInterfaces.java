
public class Task7AbstractionInterfaces {

    // Interface
    interface Payment {
        void pay(double amount);
    }

    // Abstract class
    abstract static class PaymentMethod {

        abstract void paymentDetails();
    }

    // Implementing interface and abstract class
    static class UpiPayment extends PaymentMethod implements Payment {

        @Override
        public void pay(double amount) {
            System.out.println("Payment Amount: Rs. " + amount);
        }

        @Override
        void paymentDetails() {
            System.out.println("Payment Method: UPI");
        }
    }

    public static void main(String[] args) {

        UpiPayment payment = new UpiPayment();

        System.out.println("===== ABSTRACTION =====");

        payment.paymentDetails();

        System.out.println("\n===== INTERFACE =====");

        payment.pay(500);

        System.out.println("Payment Successful!");
    }
}
