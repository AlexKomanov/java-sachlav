package lesson_04.loops;

public class Loops_04_VisibilityOfVariables {
    public static void main(String[] args) {

        String textOutside = "Outside";

        System.out.println(textOutside);
        for (int i = 0; i < 1; i++) {
            textOutside = "Now we are inside loop";

            String insideLoop = "Inside Loop";
        }

       //  insideLoop  // Нам переменная не доступна вне цикла.
        System.out.println(textOutside);

        //var type of variable
        var gh = 6;


    }
}
