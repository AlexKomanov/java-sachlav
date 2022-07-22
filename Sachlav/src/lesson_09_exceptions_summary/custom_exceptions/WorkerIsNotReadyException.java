package lesson_09_exceptions_summary.custom_exceptions;

public class WorkerIsNotReadyException extends Exception {

    public WorkerIsNotReadyException(String message) {
        super(message);
    }
}
