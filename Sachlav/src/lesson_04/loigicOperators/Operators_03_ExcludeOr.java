package lesson_04.loigicOperators;

public class Operators_03_ExcludeOr {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println(a ^ b ); // true ^ false -> true
        System.out.println(a ^ c ); // true ^ true -> false

    }
}
