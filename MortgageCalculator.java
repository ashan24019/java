import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle:");
        double principal = scanner.nextDouble();

        System.out.print("Interest rate:");
        double interestRate = scanner.nextDouble()/PERCENT/MONTHS_IN_YEARS;

        System.out.print("Period (Years):");
        int period = scanner.nextInt()*MONTHS_IN_YEARS;

        double mortgage = principal * (interestRate * Math.pow((interestRate + 1),(int)period))/(Math.pow((interestRate + 1),(int)period) - 1);

        String Formatted_Mortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Your mortgage is "+Formatted_Mortgage);
    }
}
