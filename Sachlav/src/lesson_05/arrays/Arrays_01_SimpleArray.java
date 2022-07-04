package lesson_05.arrays;

public class Arrays_01_SimpleArray {
    public static void main(String[] args) {

        int number = 5;

        int[] array = new int[5];

        array[0] = 5;
        array[1] = 10;

        System.out.println("array.length = " + array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

        array[0] = 100;

        int[] anotherArray = {5, 6, 10};
        System.out.println("anotherArray.length = " + anotherArray.length);

        System.out.println("anotherArray[2] = " + anotherArray[2]);

        anotherArray[2] = number;

        System.out.println("anotherArray[2] = " + anotherArray[2]);

    }
}
