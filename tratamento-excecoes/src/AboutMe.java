import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Type your name");
            String name = scanner.next();
            System.out.println("Type your lastname");
            String lastName = scanner.next();

            System.out.println("Type your age");
            int age = scanner.nextInt();

            System.out.println("Type your height");
            double height = scanner.nextDouble();

            System.out.println("Hi, my name is " + name + " " + lastName);
            System.out.println("i'm " + age + " years old");
            System.out.println("i'm " + height + " tall");
            scanner.close();
        }
        catch (InputMismatchException e) {
            System.err.println("Height and age need to be numeric");
        }
    }
}
