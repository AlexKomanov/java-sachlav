package lesson_08_oop_modifiers_interfaces.access_modifiers;


import lesson_08_oop_modifiers_interfaces.access_modifiers.default_values.DefaultData;

public class ProtectedExtending extends DefaultData {

    public void printName() {
        System.out.println(lastName);
    }
}
