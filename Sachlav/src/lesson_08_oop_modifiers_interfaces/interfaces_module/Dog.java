package lesson_08_oop_modifiers_interfaces.interfaces_module;

import lesson_08_oop_modifiers_interfaces.interfaces_module.interfaces.Breathable;
import lesson_08_oop_modifiers_interfaces.interfaces_module.interfaces.Runnable;

public class Dog extends Animal implements Breathable, Runnable {


    @Override
    public void howManyLegs() {
        System.out.println("I'm a dog and I have 4 legs.");
    }

    @Override
    public void breathe() {
        System.out.println("I'm a dog and I'm breathing");
    }

    @Override
    public void run(int distance) {
        System.out.println("I'm a dog and I run " + distance + " km every day");
    }
}
