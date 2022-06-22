package lesson_03_01;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your number: ");
        int a = scanner.nextInt();

        if (a >= 10) {
            System.out.println("a >= 10");
        }
        else if (a == 0) {
            System.out.println("a == 0");
        }
        else {
            System.out.println("a < 10");
        }

    }
}
