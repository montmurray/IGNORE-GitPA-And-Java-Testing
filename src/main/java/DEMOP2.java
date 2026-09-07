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

    Object n;
    while (s.hasNext()) {
      if (s.hasNextInt()) {
        n = s.nextInt();
        System.out.println(n + "? Great choice. I like you.");
        break;
      } else if (s.hasNextDouble() || s.hasNextFloat()) {
        if (s.hasNextDouble()) {
          n = s.nextDouble();
        } else {
          n = s.nextFloat();
        }
        System.out.println(n + "? Woah, you're better than I thought. You've got some knowledge");
        break;
      } else {
        System.out.println("That's not a number, don't mess up this time.");
        s.next();
      }
    }
    System.out.println("Oh look, the programmer figured it out. Bare minimum yay.");
  }
}
