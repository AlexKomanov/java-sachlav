package lesson_08_oop_modifiers_interfaces.interfaces_module;

import lesson_08_oop_modifiers_interfaces.interfaces_module.interfaces.Breathable;

public class Snake extends Animal implements Breathable {

    @Override
    public void howManyLegs() {
        System.out.println("I'm a snake and I have no legs");
    }

    @Override
    public void breathe() {
        System.out.println("I'm a snake and I'm breathing");
    }
}
