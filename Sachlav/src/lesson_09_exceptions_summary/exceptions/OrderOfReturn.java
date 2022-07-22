package lesson_09_exceptions_summary.exceptions;

public class OrderOfReturn {

    public static void main(String[] args) {

        System.out.println(returnNumber());
    }

    public static int returnNumber() {

        try {
            return 3;
        }
        catch (Exception e) {
            return 4;
        }
        finally {
            return 5;
        }

    }
}
