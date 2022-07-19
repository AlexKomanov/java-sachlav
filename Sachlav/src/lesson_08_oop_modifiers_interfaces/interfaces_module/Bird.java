package lesson_08_oop_modifiers_interfaces.interfaces_module;

import lesson_08_oop_modifiers_interfaces.interfaces_module.interfaces.Breathable;
import lesson_08_oop_modifiers_interfaces.interfaces_module.interfaces.Flyable;

public class Bird extends Animal implements Flyable, Breathable {

    @Override
    public void howManyLegs() {
        System.out.println("I'm a bird I have 2 legs");
    }

    @Override
    public void fly() {
        System.out.println("I'm a bird I'm flying");
    }

    @Override
    public void breathe() {
        System.out.println("I'm a bird I'm breathing " + OXYGEN_MIN_AMOUNT);

    }
}
