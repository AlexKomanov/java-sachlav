package lesson_09_exceptions_summary.exceptions;

public class TryCatchFinally {

    public static void main(String[] args) {

        System.out.println("Starting application");

       try {
           System.out.println(5 / 1);
           System.out.println("Try block: after exception");
       }
       catch (Exception err) {
           System.out.println(err);
           System.out.println("Catch Block");
       }
       finally {
           System.out.println("Finally block: after exception");
       }

        System.out.println("Finishing application");
    }
}
