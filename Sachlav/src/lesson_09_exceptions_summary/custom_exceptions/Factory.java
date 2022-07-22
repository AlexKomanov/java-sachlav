package lesson_09_exceptions_summary.custom_exceptions;

public class Factory {
    public static void main(String[] args) {

        Worker worker = new Worker("John");
        worker.onVacation();

        try {
            worker.goToWork();
        } catch (WorkerIsNotReadyException e) {
            e.printStackTrace();
        }
    }
}
