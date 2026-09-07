import java.util.Scanner;
import java.util.Objects;

public class DEMOP2 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("Wait---I wasn't here before...");

        System.out.println("Who are YOU? Whats YOUR name?");
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();
        System.out.println("Hello " + name + ". Nice to know you're literate.");
        System.out.println("But are you mathematical? Give me a number.");

        Object n = s.next();
        while (s.hasNext()) {
          if (n instanceof Integer) {
                System.out.println(n + "? Great choice. I like you.");
              } else if (n instanceof Double) {
                System.out.println(n + "? Woah, you're better than I thought. You've got some knowledge");
              } else {
                System.out.println("That's not a number, don't mess up this time.");
              }
        }
        //no, I am not using a logpoint.
        //Java is just Diet Swift woah.


    }
}
