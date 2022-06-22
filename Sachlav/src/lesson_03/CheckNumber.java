package lesson_03;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        // Создаём объект класса Scanner для обработки ввода с клавиатуры
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");

        // Принимаем ввод от пользователя
        int number = input.nextInt();

        if(number % 2 == 0) {
            System.out.print("Число " + number + " чётное.");
        }
        else {
            System.out.print("Число " + number  + " нечётное.");
        }

    }
}
