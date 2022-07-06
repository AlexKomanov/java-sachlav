package lesson_06.methods;

public class Methods_02_VoidWithParams {
    public static void main(String[] args) {

        String name;
        name = "Alex";

        sayHello(name);
        sayHello("Sasha");

        whoAreYou("Alex", 34);

    }

    public static void sayHello(String myName){

        System.out.println("Hello " + myName + ".");
    }

    // Getting params and doesn't return
    public static void whoAreYou(String name, int age) {
        System.out.println("Your name is " + name + ", and your age is " + age + ".");
    }

}
