package lesson_05;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomClass {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(300);
        System.out.println("randomNumber = " + randomNumber);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
