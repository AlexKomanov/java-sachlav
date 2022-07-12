package lesson_07_oop_access_modifiers.tasks.task_01_composition;

public class MyComputers {
    public static void main(String[] args) {

        GraphicCard graphicCard = new GraphicCard(333, "Nvidia");
        Chip chip = new Chip("Intel", 30303L, 4);
        SolidDrive solidDrive = new SolidDrive("Seagate", 2000);
        Memory[] memories = {
                new Memory(1, "Kingston"),
                new Memory(1, "Kingston"),
                new Memory(1, "Kingston"),
                new Memory(1, "Kingston")
        };


        Computer apple = new Computer(100500, graphicCard, chip, solidDrive, memories);

        System.out.println(apple);
    }
}
