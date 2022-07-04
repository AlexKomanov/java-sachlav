package lesson_05;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalClass {
    public static void main(String[] args) {

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int randomNum = threadLocalRandom.nextInt(2, 15+1);
        System.out.println(randomNum);
    }
}
