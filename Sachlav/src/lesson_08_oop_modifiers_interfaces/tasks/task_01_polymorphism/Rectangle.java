package lesson_08_oop_modifiers_interfaces.tasks.task_01_polymorphism;

public class Rectangle extends Figure {

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void printArea() {
        System.out.println("Rectangle area = " + calculateArea());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                "} " + super.toString();
    }
}
