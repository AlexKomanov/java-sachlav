package lesson_08_oop_modifiers_interfaces.tasks.task_02_interfaces;

import java.util.HashSet;
import java.util.Set;

public class MyPrints {
    public static void main(String[] args) {

        Printable book = new Book("Harry Potter");
        Printable magazine = new Magazine("Forbes");
        Printable book2 = new Book("Lord of the rings");
        Printable magazine2 = new Magazine("Murzilka");

        Set<Printable> printableHashSet = new HashSet<>();
        printableHashSet.add(book);
        printableHashSet.add(book2);
        printableHashSet.add(magazine);
        printableHashSet.add(magazine2);

        printableHashSet.forEach(Printable::print);

    }
}
