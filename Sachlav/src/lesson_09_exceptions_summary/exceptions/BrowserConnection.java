package lesson_09_exceptions_summary.exceptions;

public class BrowserConnection {
    public static void main(String[] args) throws InterruptedException {

        String response = null;
        System.out.println("======================================");
        System.out.println("Opens Browser");
        Thread.sleep(3000);
        System.out.println("======================================");
        System.out.println("Creating connection");
        Thread.sleep(3000);
        System.out.println("======================================");

        try {
            if (response.equals(null)) {
                throw new NullPointerException();
            }
        }
        catch (Exception e) {
            e.printStackTrace();

        }
        finally {
            System.out.println("======================================");
            Thread.sleep(3000);
            System.out.println("Closing connection");
            Thread.sleep(3000);
            System.out.println("======================================");
            System.out.println("Closing browser");
            Thread.sleep(3000);
            System.out.println("======================================");
        }
        Thread.sleep(3000);
        System.out.println("Waiting for a new session.");
        System.out.println("======================================");
    }
}
