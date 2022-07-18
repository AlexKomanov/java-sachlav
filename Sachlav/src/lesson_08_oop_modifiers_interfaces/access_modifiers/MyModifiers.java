package lesson_08_oop_modifiers_interfaces.access_modifiers;

import lesson_08_oop_modifiers_interfaces.access_modifiers.default_values.DefaultData;

public class MyModifiers {
    public static void main(String[] args) {

        DefaultData defaultData = new DefaultData();
//        defaultData.name = "Alex"; // <- Default field triggers an error

//        defaultData.lastName = "dfdfdfdf";  // <- protected ,modifier cannot be accessible

//        DefaultData.NUM = 10; //Final variable cannot get new value

        System.out.println(DefaultData.NUM);


    }
}
