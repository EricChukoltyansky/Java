import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            int x, units, tens, hundreds;
            System.out.println("Enter a number: ");
            x = scan.nextInt();
            units = x % 10;
            tens = (x % 100) / 10;
            hundreds = ((x/100) % 10) % 10;
            System.out.println(units);
            System.out.println(tens);
            System.out.println(hundreds);
        }
        
    }
}
