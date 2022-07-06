package lesson_06.methods;

public class Methods_03_ReturnWithParams {
    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 10;

        System.out.println("summary(5, 10) = " + summary(5, 10));

        int result = summary(firstNumber, secondNumber);
        System.out.println("result = " + result);

    }

    public static int summary(int a, int b) {
//        int result = a + b;
        return a + b;
    }
}
