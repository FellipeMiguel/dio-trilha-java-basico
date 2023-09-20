import java.util.concurrent.ThreadLocalRandom;
public class WhileExample {
    public static void main(String[] args) {
        double allowance = 50.0;
        while (allowance > 0) {
            double candyPrice = randomNumber();
            if (candyPrice > allowance){
                candyPrice = allowance;
            }

            System.out.println("The price of the candy is " + candyPrice + " add to cart");
            allowance -= candyPrice;
        }

        System.out.println("Allowance: " + allowance);
        System.out.println("Little John wasted all his allowance on candy");
    }

    private static double randomNumber () {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
