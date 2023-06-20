package Conditionals;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int age;
            double productPrice;
            int day;

            System.out.println("Enter your age: ");
            age = scan.nextInt();
            System.out.println ("Enter product price");
            productPrice = scan.nextDouble();
            System.out.println("Enter the day");

            if (age > 18) {
                System.out.println("Age is above 18");
            }

            if (productPrice < 100 && productPrice > 0) {
                System.out.println("Product is below 100 and legal");
            }

            if(day == 2) {
                System.out.println("Today is Monday");
            }
        }


    }
}
