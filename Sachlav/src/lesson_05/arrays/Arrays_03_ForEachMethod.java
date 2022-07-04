package lesson_05.arrays;

public class Arrays_03_ForEachMethod {
    public static void main(String[] args) {

        int[] array = new int[5];

        System.out.println("First for loop run");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
           array[i] = 5;
        }

        System.out.println("\nSecond for loop run");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int[] array2 = new int[5];
        System.out.println("\nFirst for-each run");
        for (int number : array2) {
            System.out.print(number + " ");
        }


        for (int number : array2) {
            number = 5;
        }

        System.out.println("\nSecond for-each run");
        for (int number : array2) {
            System.out.print(number + " ");
        }

    }
}
