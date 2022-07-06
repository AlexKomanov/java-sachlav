package lesson_06.tasks;

public class Tasks_01_MaxMinInArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println("average() = " + average(array));
//        System.out.println("findMin() = " + findMin(array));
//        System.out.println("findMax() = " + findMax(array));

        printResults(array);
    }

    public static int average(int[] array) {
        int sum = 0;

        for (int number : array) {
            sum += number;
        }

        return sum / array.length;

    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int number : array) {
            if (number < min) {
                min= number;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > max) {
                max= number;
            }
        }
        return max;
    }

    public static void printResults(int[] array) {
        System.out.println("findMax() = " + findMax(array));
        System.out.println("findMin() = " + findMin(array));
        System.out.println("average() = " + average(array));
    }
}
