public class Atm {
  public static void main(String[] args) {
    double cache = 25.0;
    double neededCache = 17.0;

    if (neededCache < cache) cache -= neededCache;

    System.out.println(cache);
  }
}
