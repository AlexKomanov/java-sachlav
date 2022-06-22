package lesson_03_01;

public class Ternary {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 6;
        String result;
                                    // true                false
        result = (a == b) ? "a and b are equal" : "a and b are not equal";

        System.out.println("result = " + result);

        result = (a == c) ? "a and c are equal" : "a and c are not equal";

        System.out.println("result = " + result);


    }
}
