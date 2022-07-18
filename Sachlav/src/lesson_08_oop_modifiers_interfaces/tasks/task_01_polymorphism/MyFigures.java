package lesson_08_oop_modifiers_interfaces.tasks.task_01_polymorphism;

import java.util.ArrayList;

public class MyFigures {
    public static void main(String[] args) {

        Figure triangle1 = new Triangle(5, 10);
        Figure square1 = new Square(5, 5);
        Figure rectangle1 = new Rectangle(7, 15);

        ArrayList<Figure> arrayList = new ArrayList<>();

        arrayList.add(triangle1);
        arrayList.add(rectangle1);
        arrayList.add(square1);

        arrayList.forEach(x -> x.printArea());

    }
}
