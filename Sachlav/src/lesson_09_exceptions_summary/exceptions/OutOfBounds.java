package lesson_09_exceptions_summary.exceptions;

public class OutOfBounds {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        System.out.println("Starting");

        numbers[57] = 56;

        System.out.println("Finishing");
    }
}
