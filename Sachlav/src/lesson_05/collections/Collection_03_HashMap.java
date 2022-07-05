package lesson_05.collections;

import java.util.HashMap;
import java.util.Map;

public class Collection_03_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1111, "Alex");
        students.put(2222, "Roma");
        students.put(3333, "Polina");
        students.put(4444, "Bill Gates");

//        System.out.println(students.get(11));
//        System.out.println(students.get(1111));
//        System.out.println(students.containsKey(22));
//        System.out.println(students.containsKey(2222));
//        System.out.println(students.containsValue("Bill Gates"));
//        System.out.println(students.containsValue("Bill"));


//        for (Map.Entry<Integer, String> integerStringEntry : students.entrySet()) {
//            System.out.println(integerStringEntry.getKey() + " - " + integerStringEntry.getValue());
//        }

        students.forEach((key, value) -> System.out.println(key + " - "  + value));

        students.put(4444, "Pavel Volya");

        students.forEach((key, value) -> System.out.println(key + " - "  + value));
    }
}
