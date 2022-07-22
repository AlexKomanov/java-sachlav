package lesson_09_exceptions_summary.tasks.task_02_science_calculator;

import lesson_09_exceptions_summary.tasks.task_01_basic_calculator.Calculate;

public class ScienceCalculator implements Calculate {


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
                arithmeticException.printStackTrace();
            }
        }

    }

    public void performAction(int action, double numberA, double numberB) {
        switch (action) {
            case 1:
                sum(numberA, numberB);
                break;
            case 2:
                minus(numberA, numberB);
                break;
            case 3:
                multiple(numberA, numberB);
                break;
            case 4:
                division(numberA, numberB);
                break;
        }

    }




}
