package lesson_06.methods;

import java.util.ArrayList;

public class Methods_02_01_VoidWithParams {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList;
        arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        printArrayList(arrayList);

        arrayList.add(4);

        printArrayList(arrayList);

    }

    // Getting params and doesn't return
    public static void printArrayList(ArrayList<Integer> list) {
        System.out.println("List size is " + list.size());
        System.out.println("Array list: ");
        list.forEach((x) -> System.out.println(x));
    }


}
