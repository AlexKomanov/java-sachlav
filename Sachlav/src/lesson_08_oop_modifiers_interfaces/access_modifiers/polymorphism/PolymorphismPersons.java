package lesson_08_oop_modifiers_interfaces.access_modifiers.polymorphism;

import lesson_07_oop_access_modifiers.inheritance.Child;
import lesson_07_oop_access_modifiers.inheritance.Girl;
import lesson_07_oop_access_modifiers.inheritance.Person;
import lesson_07_oop_access_modifiers.inheritance.Student;

import java.util.ArrayList;

public class PolymorphismPersons {
    public static void main(String[] args) {

        Person child  = new Child("Alex", "alex@email.com", "023423423", "parent");
        Person girl = new Girl("girl", "girl_email", "4353453454");
        Person student = new Student("Alex_Student", "alex@email.com", "023423423", 78);


        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(child);
        personArrayList.add(girl);
        personArrayList.add(student);

        personArrayList.forEach(x -> x.whoAreYou());
    }
}
