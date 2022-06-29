package lesson_04.classTasks;

public class Task_02_EvenNumbersForLoop {
    public static void main(String[] args) {

        for (int i = 1000; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
