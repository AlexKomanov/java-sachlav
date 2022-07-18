package lesson_08_oop_modifiers_interfaces.tasks.task_01_polymorphism;

public class Square extends Figure{


    public Square(double height, double width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return Math.pow(height, 2);
    }

    @Override
    public void printArea() {
        System.out.println("Square area = " + calculateArea());
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                "} " + super.toString();
    }
}
