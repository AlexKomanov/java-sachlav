package lesson_03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int result;

        System.out.println("Введите первое число: ");
        x = scanner.nextInt();
        System.out.println("Введите второе число: ");
        y = scanner.nextInt();

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        result = x + y;
        System.out.println("result = " + result);
        result = x - y;
        System.out.println("result = " + result);
        result = x * y;
        System.out.println("result = " + result);
        result = x / y;
        System.out.println("result = " + result);

    }
}
