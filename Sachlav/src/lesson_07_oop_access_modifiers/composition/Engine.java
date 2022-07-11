package lesson_07_oop_access_modifiers.composition;

public class Engine {

    private int horsePower;
    private int amountOfCylinders;

    public Engine(int horsePower, int amountOfCylinders) {
        this.horsePower = horsePower;
        this.amountOfCylinders = amountOfCylinders;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getAmountOfCylinders() {
        return amountOfCylinders;
    }

    public void setAmountOfCylinders(int amountOfCylinders) {
        this.amountOfCylinders = amountOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", amountOfCylinders=" + amountOfCylinders +
                '}';
    }
}
