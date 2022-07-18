package lesson_08_oop_modifiers_interfaces.tasks.task_01_polymorphism;

public abstract class Figure {

    protected double height;
    protected double width;

    public Figure(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public abstract double calculateArea();

    public abstract void printArea();
}
