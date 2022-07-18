package lesson_08_oop_modifiers_interfaces.tasks.task_01_polymorphism;

public class Triangle extends Figure {


    public Triangle(double height, double width) {
        super(height, width);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                "} " + super.toString();
    }

    @Override
    public double calculateArea() {
        return ((height * width) / 2);
    }

    @Override
    public void printArea() {
        System.out.println("Triangle area = " + calculateArea());
    }
}
