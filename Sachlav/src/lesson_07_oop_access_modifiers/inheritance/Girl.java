package lesson_07_oop_access_modifiers.inheritance;

public class Girl extends Person {


    public Girl(String name, String email, String phone) {
        super(name, email, phone);
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a girl");
    }
}
