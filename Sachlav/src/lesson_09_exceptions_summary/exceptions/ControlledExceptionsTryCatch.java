package lesson_09_exceptions_summary.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ControlledExceptionsTryCatch {
    public static void main(String[] args) {

        File file = new File("D://file.txt");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Чувак - а где же твой файл???");
        }

    }
}
