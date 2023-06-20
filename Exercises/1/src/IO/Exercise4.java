import java.util.Scanner;

public class Exercise4 {
    public static void main() {
        try(Scanner scan = new Scanner(System.in)) {
            int x, y;
            System.out.println("Enter two numbers");
            x = scan.nextInt();
            y = scan.nextInt();

            System.out.println("The sum of the two numbers is: " + (x + y));
            System.out.println("The difference of the two numbers is: " + (x - y));
            System.out.println("The product of the two numbers is: " + (x * y));
            System.out.println("The quotient of the two numbers is: " + (x / y));
            
        }
    }
}
