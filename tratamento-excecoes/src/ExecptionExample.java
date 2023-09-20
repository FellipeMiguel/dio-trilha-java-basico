import java.text.NumberFormat;
import java.text.ParseException;

public class ExecptionExample {
    public static void main(String[] args) {
        Number value;
        try {
            value = NumberFormat.getInstance().parse("a1.75");
            System.out.println(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
