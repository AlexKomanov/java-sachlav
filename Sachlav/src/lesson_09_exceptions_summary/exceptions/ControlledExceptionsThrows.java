package lesson_09_exceptions_summary.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ControlledExceptionsThrows {
    public static void main(String[] args) throws Exception {

        File file = new File("D://file.txt");
        FileReader fileReader = new FileReader(file);
        fileReader.close();
    }
}
