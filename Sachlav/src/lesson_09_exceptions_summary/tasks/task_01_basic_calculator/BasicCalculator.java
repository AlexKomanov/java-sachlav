package lesson_09_exceptions_summary.tasks.task_01_basic_calculator;

public class BasicCalculator implements Calculate{

    /**
     * Создайте interface Calculate.  В нём 4 метода: void sum(double a, double b), void minus(double a, double b),
     * void multiple(double a, double b), void division(double a, double b).
     * Создайте класс BasicCalculator. Реализуйте interface Calculate.
     *
     * *Метод деления обработайте с помощью exception (можно написать свой exception).
     *
     * Создайте класс BasicCalculatorMain.
     *
     * Создайте объект класса BasicCalculator. Вызовите возможные методы.
     */


    @Override
    public void sum(double a, double b) {
        System.out.println("Result is " + (a + b));
    }

    @Override
    public void minus(double a, double b) {
        System.out.println("Result is " + (a - b));
    }

    @Override
    public void multiple(double a, double b) {
        System.out.println("Result is " + (a * b));
    }

    @Override
    public void division(double a, double b) {
        if(!(b == 0)){
            System.out.println("Result is " + (a / b));
        }
        else {
            try {
                System.out.println("Result is " + ((int)a / (int)b));
            }
            catch (ArithmeticException arithmeticException) {
                System.out.println(arithmeticException.getCause());
                System.out.println(arithmeticException.getMessage());
            }
        }

    }




}
