package lesson_06.classes.students;

import java.util.ArrayList;

public class MyStudents {
    public static void main(String[] args) {

        Student alex = new Student("Alex", 34);
        System.out.println(alex.getName());

        Student newStudent = new Student("New Student", -2);

        System.out.println(alex);
        System.out.println(newStudent);

        ArrayList<Student> students = new ArrayList<>();
        students.add(alex);
        students.add(alex);

        students.forEach((x) -> System.out.println(x));

    }
}
