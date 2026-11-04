
public class Task11Multithreading {

    // First thread
    static class FirstThread extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("First Thread: " + i);
            }
        }
    }

    // Second thread
    static class SecondThread extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Second Thread: " + i);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("===== MULTITHREADING =====");

        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.start();
        t2.start();
    }
}
