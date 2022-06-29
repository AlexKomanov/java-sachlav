package lesson_04.classTasks;

public class Task_03_NumbersDividedBy5_While {

    public static void main(String[] args) {

        //Вывести все числа от 0 до 1000 включительно которые делятся на 5
        int i = 0;

        while (i <= 1000) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
