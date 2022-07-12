package lesson_07_oop_access_modifiers.inheritance;

public class Student extends Person {

    private double grade;

    public Student(String name, String email, String phone, double grade) {
        super(name, email, phone);
        this.grade = grade;
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a student");
    }

    @Override
    public void whereDoYouLive() {
        System.out.println("I live in Tel Aviv");
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                "} " + super.toString();
    }
}
