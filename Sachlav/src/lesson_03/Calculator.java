package lesson_03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        double result;

        System.out.println("Введите первое число: ");
        x = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        y = scanner.nextDouble();

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
