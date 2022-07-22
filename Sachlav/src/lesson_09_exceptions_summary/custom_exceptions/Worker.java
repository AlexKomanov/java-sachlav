package lesson_09_exceptions_summary.custom_exceptions;

public class Worker {

    private String name;
    boolean isReadyToWork;

    public Worker(String name) {
        this.name = name;
    }

    public void readyToWork() {
        isReadyToWork = true;
    }

    public void onVacation() {
        isReadyToWork = false;
    }

    public void goToWork() throws WorkerIsNotReadyException {
        if (isReadyToWork) {
            System.out.println("Worker " + name + " is ready to work!");
        }
        else {
            throw new WorkerIsNotReadyException("Worker " + name + " is not ready...");
        }
    }


}
