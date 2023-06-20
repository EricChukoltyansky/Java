package Conditionals;
import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        int number,a,b,c;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a 3 digits number numbers: ");
            number = scan.nextInt();
        }
        a = number / 100;
        b = (number % 100) / 10;
        c = number % 10;

        if (a < b && b < c) {
            System.out.println("The number is sorted");
        } else {
            System.out.println("The number is not sorted");
        }
    }
}
