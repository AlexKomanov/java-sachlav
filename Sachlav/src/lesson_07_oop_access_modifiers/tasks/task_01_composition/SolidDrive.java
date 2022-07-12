package lesson_07_oop_access_modifiers.tasks.task_01_composition;

public class SolidDrive {

    private String brand;
    private int capacity;

    public SolidDrive(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "SolidDrive{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
