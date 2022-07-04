package lesson_05.collections;

import java.util.ArrayList;
import java.util.Random;

public class Collection_01_ArrayList {
    public static void main(String[] args) {

        int[] array = {1, 2, 4};

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("size of  array list = " + arrayList.size());

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(100));
        }

        System.out.println("\n--------------------------");
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println("\nsize of  array list = " + arrayList.size());

        arrayList.remove(5);


        System.out.println("\n--------------------------");
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }


        System.out.println("\nsize of  array list = " + arrayList.size());
    }
}
