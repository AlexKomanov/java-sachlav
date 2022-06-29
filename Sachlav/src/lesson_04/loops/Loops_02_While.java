package lesson_04.loops;

import java.util.Scanner;

public class Loops_02_While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert you number: ");
        int a = scanner.nextInt();

        while (a < 10) {
            System.out.println(a);
            a++;
        }
    }
}
