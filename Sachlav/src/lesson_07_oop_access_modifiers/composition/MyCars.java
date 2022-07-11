package lesson_07_oop_access_modifiers.composition;

public class MyCars {
    public static void main(String[] args) {

        Engine bmwEngine = new Engine(250, 8);
        bmwEngine.setHorsePower(600);
        Wheel[] bmwWheels = new Wheel[4];
        bmwWheels[0] = new Wheel(18, 2.5);
        bmwWheels[1] = new Wheel(18, 2.5);
        bmwWheels[2] = new Wheel(18, 2.5);
        bmwWheels[3] = new Wheel(18, 2.5);

        Car bmw = new Car("BMW", "X5", 2022, bmwEngine, bmwWheels);
        System.out.println(bmw);

        bmw.getEngine().setHorsePower(400);

        Car tesla = new Car("Tesla", "Tesla 3", 2021, new Engine(300, 0), bmwWheels);

        System.out.println(tesla);
        System.out.println("tesla.getEngine().getHorsePower() = " + tesla.getEngine().getHorsePower());
    }
}
