package Conditionals;
import java.util.Scanner;

public class DollarToShekel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double usd, nis;
        final double USD_NIS = 3.5;

        System.out.println("Enter price in usd:")
        usd = scan.nextDouble();

        if (usd > 0) {
            nis = usd * USD_NIS;
            System.out.println("Price in nus us:" +nis);
        }
        System.out.println("Error - price must be positive");
    }
}
