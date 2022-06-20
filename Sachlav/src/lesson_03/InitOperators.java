package lesson_03;

public class InitOperators {
    public static void main(String[] args) {

        double a = 5.0;

        System.out.println("a = " + a);
        a = a + 2;
        System.out.println("a = " + a);
        a += 2;
        System.out.println("a = " + a);

        a = a - 2;
        System.out.println("a = " + a);
        a -= 2;
        System.out.println("a = " + a);

        a *= 6;
        System.out.println("a = " + a);

        a /= 6;
        System.out.println("a = " + a);
    }
}
