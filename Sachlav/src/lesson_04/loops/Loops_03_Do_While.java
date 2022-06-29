package lesson_04.loops;

import java.util.Scanner;

public class Loops_03_Do_While {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert you number: ");
        int a = scanner.nextInt();

        do {
            System.out.println(a);
            a++;
        }
        while (a < 10);

        System.out.println(a);
    }
}
