import java.text.NumberFormat;

public class Formatting_numbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(23455.666);
        System.out.println(result);

    }
}
