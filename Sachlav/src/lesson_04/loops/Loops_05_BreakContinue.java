package lesson_04.loops;

public class Loops_05_BreakContinue {
    public static void main(String[] args) {

        int a = 0;

        while (a < 10) {
            a++;

            if (a == 3 || a == 5) {
                continue;
            }

            if (a == 8) {
                break;
            }

            System.out.println(a);


        }
    }
}
