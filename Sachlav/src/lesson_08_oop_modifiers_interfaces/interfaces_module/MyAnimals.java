package lesson_08_oop_modifiers_interfaces.interfaces_module;

import lesson_08_oop_modifiers_interfaces.interfaces_module.interfaces.Breathable;
import lesson_08_oop_modifiers_interfaces.interfaces_module.interfaces.Flyable;
import lesson_08_oop_modifiers_interfaces.interfaces_module.interfaces.Runnable;

import java.util.ArrayList;

public class MyAnimals {
    public static void main(String[] args) {

        Runnable dog = new Dog();
        Breathable dog2 = new Dog();
        Dog dog3 = new Dog();

        Flyable bird = new Bird();
        Breathable bird2 = new Bird();

        Breathable snake = new Snake();

        ArrayList<Breathable> breathableArrayList = new ArrayList<>();

        breathableArrayList.add(dog3);
        breathableArrayList.add(dog2);
        breathableArrayList.add(bird2);
        breathableArrayList.add(snake);

//        breathableArrayList.forEach(x -> x.breathe());

        Animal animalDog = new Dog();
        Animal animalSnake = new Snake();
        Animal animalBird = new Bird();

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(animalDog);
        animalArrayList.add(animalSnake);
        animalArrayList.add(animalBird);

        animalArrayList.forEach(x -> x.howManyLegs());

    }
}
