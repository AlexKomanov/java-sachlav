package lesson_06.classes.cars;

public class Car {

    String manufacture;
    String color;
    int year;
    String model;

    static int created = 0;

    public Car() {
        created++;
    }

    public Car(String manufacture, String color, int year) {
        this.manufacture = manufacture;
        this.color = color;
        this.year = year;
        created++;
    }

    public Car(String manufacture, String color, int year, String model) {
        this.manufacture = manufacture;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public static void carsCreated() {
        System.out.println("created = " + created);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacture='" + manufacture + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                '}';
    }
}
