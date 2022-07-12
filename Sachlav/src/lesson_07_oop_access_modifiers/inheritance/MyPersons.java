package lesson_07_oop_access_modifiers.inheritance;

import java.util.ArrayList;

public class MyPersons {
    public static void main(String[] args) {

     //  Person person = new Person("Person", "email", "phone"); //Abstract class - triggers error
     //   Teacher teacher = new Teacher(); // Abstract class


       Student student = new Student("Alex",
               "alex@gmail", "044343", 70);

//        System.out.println(student.toString());
//        student.whereDoYouLive();
//        student.whoAreYou();

        Girl girl = new Girl("girl", "email", "045645");
//        System.out.println(girl.toString());
//        girl.whereDoYouLive();
//        girl.whoAreYou();

        Child child = new Child("child", "email", "0333", "name");
//        child.whoAreYou();

        ArrayList<Person> arrayList = new ArrayList();
        arrayList.add(child);
        arrayList.add(student);
        arrayList.add(girl);

        arrayList.forEach((x) -> x.whoAreYou());

    }
}
