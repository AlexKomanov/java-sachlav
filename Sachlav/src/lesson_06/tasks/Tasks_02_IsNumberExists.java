package lesson_06.tasks;

public class Tasks_02_IsNumberExists {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int myValue = 11;

        System.out.println(isNumberExists(myValue, array));
    }

    public static boolean isNumberExists(int a, int[] array) {
        boolean flag = false;

        for (int number : array) {
            if (a == number) {
                flag = true;
            }
        }
        return flag;
    }
}
