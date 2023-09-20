import java.util.Random;
public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("Typing...");

        do {
            System.out.println("Phone is ring");
        } while (playing());

        System.out.println("Hello!!");
    }
    private static boolean playing() {
        boolean answered = new Random().nextInt(3)==1;
        System.out.println("Did you answered? " + answered);
        // denied the playing
        return ! answered;
    }
}
