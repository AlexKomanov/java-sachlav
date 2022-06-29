package lesson_04.loops;

public class Loops_06_NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
                System.out.println("i = " + i);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", j);
            }
            System.out.println();
        }
    }
}
